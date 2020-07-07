package com.springframework.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "My greeting service welcome---Setter";
    }
}
