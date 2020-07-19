package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello(){
        return "<h1>Hello from Jessie!</h1> "
            +"<h2>You can do this!</h2>"
            +"<h3>Test aggain! CICD from Github<h3>";
    }
}
