package com.disney.disneyworld.model.mapper;

import com.disney.disneyworld.model.response.AuthenticationResponse;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AutheMapper {

    public AuthenticationResponse toDTO(UserDetails userDetails, String jwt){
        return AuthenticationResponse.builder()
                .username(userDetails.getUsername())
                .jwt(jwt)
                .build();
    }
}
