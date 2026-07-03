package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/")
    public String home() {
        return """
        Welcome to Calculator API!

        Available Endpoints:
        /add/{a}/{b}
        /subtract/{a}/{b}
        /multiply/{a}/{b}
        /divide/{a}/{b}

        Example:
        /add/10/20
        """;
    }

    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return a * b;
    }

    @GetMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            return "Division by zero is not allowed";
        }
        return String.valueOf((double) a / b);
    }
}