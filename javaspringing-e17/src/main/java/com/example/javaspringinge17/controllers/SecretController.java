package com.example.javaspringinge17.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

    @Value("${parola.text}")
    private String parola;

    @GetMapping("/secret")
    public String getSecret() {
        return parola;
    }
}
