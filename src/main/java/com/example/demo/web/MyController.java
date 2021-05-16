package com.example.demo.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hi")
    public String hello(){
        return "hello world  666";
    }
}
