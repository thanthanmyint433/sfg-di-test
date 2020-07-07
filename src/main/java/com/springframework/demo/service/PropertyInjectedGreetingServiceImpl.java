package com.springframework.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "My greeting service welcome---Property";
    }
}
