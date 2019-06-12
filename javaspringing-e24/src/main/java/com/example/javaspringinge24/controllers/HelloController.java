package com.example.javaspringinge24.controllers;

import com.example.javaspringinge24.proxy.NameServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private NameServiceProxy nameServiceProxy;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, " + nameServiceProxy.getName() + "!";
    }
}
