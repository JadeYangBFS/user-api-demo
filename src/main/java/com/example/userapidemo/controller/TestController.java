package com.example.userapidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String helloWorld() {
        return "Bonsoir et bonjour lol, Welcome to the world of CI/CD!!!";
    }

}
