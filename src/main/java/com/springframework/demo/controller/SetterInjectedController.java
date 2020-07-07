package com.springframework.demo.controller;

import com.springframework.demo.service.ConstructorGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Qualifier("setterInjectedServiceImpl")
    @Autowired
    public ConstructorGreetingService constructorGreetingService;


    public void setConstructorGreetingService(ConstructorGreetingService constructorGreetingService){
        this.constructorGreetingService = constructorGreetingService;

    }
    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}
