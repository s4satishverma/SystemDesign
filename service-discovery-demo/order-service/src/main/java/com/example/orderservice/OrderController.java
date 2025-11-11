package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public String getUserDetails(@PathVariable String id) {
        String userServiceUrl = "http://user-service/users/" + id;
        return restTemplate.getForObject(userServiceUrl, String.class);
    }
}
