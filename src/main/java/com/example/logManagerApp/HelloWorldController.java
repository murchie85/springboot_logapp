package com.example.logManagerApp;

import org.springframework.web.bind.annotation.GetMapping; // annotation maps HTTP GET requests
import org.springframework.web.bind.annotation.RestController; //

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}

