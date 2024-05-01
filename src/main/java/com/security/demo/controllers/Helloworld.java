package com.security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @GetMapping("/hello")
    public String helloworld(){
        return "Hello World";
    }
}
