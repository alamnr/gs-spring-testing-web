package com.example.gsspringtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    // Autowired injection
    /*@Autowired
    private GreetingService service;*/

    // constructor injection
    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public String greet(){
        return service.greet();
    }

}
