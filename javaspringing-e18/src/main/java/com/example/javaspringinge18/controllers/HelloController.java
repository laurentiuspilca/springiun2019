package com.example.javaspringinge18.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "HELLO";
    }

    @GetMapping("/world")
    public String world() {
        return "WORLD";
    }
}
