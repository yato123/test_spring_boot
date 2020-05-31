package com.example.testspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String sayHi(){
        System.out.println("java");
        this.test();
        System.out.println("hello word");
        return "Helllo Spring Boot aa";
    }

    private String test(){
        return "test";
    }

}
