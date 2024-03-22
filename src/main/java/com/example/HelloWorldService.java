package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldService {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldService.class, args);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World! This is a Spring Boot service.";
    }
}

