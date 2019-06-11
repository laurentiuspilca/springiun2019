package com.example.javaspringinge14.controllers;

import com.example.javaspringinge14.dto.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController // numele beanului
@RequestMapping(path = "/person")
public class PersonController {

//    @GetMapping("/get")
    @RequestMapping(method = RequestMethod.GET, path = "/get")
    public Person getPerson(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);

        Person p = new Person();
        p.setName("Bill");
        return p;
    }
}
