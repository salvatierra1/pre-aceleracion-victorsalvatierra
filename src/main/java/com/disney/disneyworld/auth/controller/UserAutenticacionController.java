package com.disney.disneyworld.auth.controller;

import com.disney.disneyworld.auth.service.UserDetailsCustomService;
import com.disney.disneyworld.model.request.RegisterRequest;
import com.disney.disneyworld.model.response.RegisterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserAutenticacionController {

    private final UserDetailsCustomService userDetailsCustomService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterResponse createUser(@RequestBody RegisterRequest registerRequest){
        return userDetailsCustomService.crearUser(registerRequest);
    }

}
