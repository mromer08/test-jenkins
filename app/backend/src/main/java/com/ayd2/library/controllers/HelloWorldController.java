package com.ayd2.library.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController("/ping")
public class HelloWorldController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }   
}
