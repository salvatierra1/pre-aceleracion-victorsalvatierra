package com.disney.disneyworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inicio")
public class TestController {

    public String mensa(){
        return "Hola Mundo";
    }
    @GetMapping("/mensaje")
    public String mensaje(){
        return "Hola Victor";
    }
}
