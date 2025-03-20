package com.ayd2.library.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController("/ping")
public class HelloWorldController {

    @Value("${super.secret}")
    String secret;
    @GetMapping("/ping")
    public String ping() {
        return "pong"+secret;
    }   
}
