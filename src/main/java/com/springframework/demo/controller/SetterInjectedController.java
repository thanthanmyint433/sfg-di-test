package com.springframework.demo.controller;

import com.springframework.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Autowired
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;

    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
