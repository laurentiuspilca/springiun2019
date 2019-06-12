package com.example.javaspringinge24.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NameServiceProxy {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${name.service.url}")
    private String nameServiceUrl;

    public String getName() {
        return restTemplate.getForObject(nameServiceUrl, String.class);
    }
}
