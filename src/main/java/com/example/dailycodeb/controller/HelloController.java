package com.example.dailycodeb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping( "/api/v1/helloWorld")

public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMessage;


@GetMapping("/hello")
    public String helloWorld() {
       return welcomeMessage;
    }
}
