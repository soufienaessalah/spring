
package com.example.springproj; // Change to your package name

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String home() {
        return "Welcome to the application!";
    }
}

