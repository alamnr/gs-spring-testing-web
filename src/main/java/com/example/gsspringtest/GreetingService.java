package com.example.gsspringtest;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Greeting from service";
    }
}
