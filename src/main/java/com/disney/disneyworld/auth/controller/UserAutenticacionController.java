package com.disney.disneyworld.auth.controller;

import com.disney.disneyworld.auth.service.UserAuthService;
import com.disney.disneyworld.auth.service.UserDetailsCustomService;
import com.disney.disneyworld.model.request.AuthenticationRequest;
import com.disney.disneyworld.model.request.RegisterRequest;
import com.disney.disneyworld.model.response.AuthenticationResponse;
import com.disney.disneyworld.model.response.RegisterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserAutenticacionController {

    private final UserDetailsCustomService userDetailsCustomService;
    private final UserAuthService userAuthService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterResponse createUser(@RequestBody RegisterRequest registerRequest){
        return userDetailsCustomService.crearUser(registerRequest);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public AuthenticationResponse loginDelUser(@RequestBody AuthenticationRequest authenticationRequest){

        return userAuthService.login(authenticationRequest);
    }

}
