package com.example.javaspringinge14.controllers;

import com.example.javaspringinge14.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/goodbye")
    public String goodbye(@RequestHeader("name") String name) {
        return "Goodbye, " + name + "!";
    }

    @PostMapping("/solong")
    public String solong(@RequestBody Person p) {
        return "So long, " + p.getName() + "!";
    }
}
