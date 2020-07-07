package com.springframework.demo.controller;

import com.springframework.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        String greting=greetingService.sayGreeting();
        return greting;
    }
}
