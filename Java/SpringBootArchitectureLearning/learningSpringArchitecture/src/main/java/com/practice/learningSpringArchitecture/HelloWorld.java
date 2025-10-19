package com.practice.learningSpringArchitecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/get")
    public String hello(){
        return "Hello world";
    }
}

