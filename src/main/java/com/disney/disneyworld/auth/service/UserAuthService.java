package com.disney.disneyworld.auth.service;

import com.disney.disneyworld.model.mapper.AutheMapper;
import com.disney.disneyworld.model.request.AuthenticationRequest;
import com.disney.disneyworld.model.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserAuthService {

    private final UserDetailsCustomService userDetailsCustomService;
    private final AuthenticationManager authenticationManager;
    private final AutheMapper autheMapper;

    public AuthenticationResponse login(AuthenticationRequest authenticationRequest){

        UserDetails userDetails = userDetailsCustomService.loadUserByUsername(authenticationRequest.getUsername());
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                authenticationRequest.getUsername(),
                authenticationRequest.getPassword(),
                Collections.emptyList()
        );

        authenticationManager.authenticate(authenticationToken);

        return autheMapper.toDTO(userDetails, "Esta es mi JWT - reemplazar");
    }
}
