package com.springframework.demo.controller;

import com.springframework.demo.service.ConstructorGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public ConstructorGreetingService constructorGreetingService;

    public String getGreeting(){
        String greting= constructorGreetingService.sayGreeting();
        return greting;
    }
}
