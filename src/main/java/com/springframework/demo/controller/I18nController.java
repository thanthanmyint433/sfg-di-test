package com.springframework.demo.controller;

import com.springframework.demo.service.ConstructorGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    public final ConstructorGreetingService constructorGreetingService;

    @Autowired
    public I18nController(@Qualifier("i18nService") ConstructorGreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    public String sayHello(){
        return constructorGreetingService.sayGreeting();
    }
}
