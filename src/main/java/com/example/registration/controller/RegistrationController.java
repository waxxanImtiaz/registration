package com.example.registration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegistrationController {

    @GetMapping("/")

    public String test(){
        return "This is registration service";
    }

    @GetMapping("/register")
    public String register(){
        return "This is registration method";
    }
    @GetMapping(value = "/circuit")

    public String hello() throws InterruptedException {
        Thread.sleep(3000);
        return "Welcome Hystrix";
    }

}
