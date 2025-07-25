package com.abc.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbcApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<h1>Hello from ABC Spring Boot App running on EC2!</h1>";
    }
}
