package com.springframework.demo.controller;

import com.springframework.demo.service.ConstructorGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class Mycontroller {
    public final ConstructorGreetingService constructorGreetingService;

    public Mycontroller(ConstructorGreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    public String sayHello(){

        return constructorGreetingService.sayGreeting();
    }
}
