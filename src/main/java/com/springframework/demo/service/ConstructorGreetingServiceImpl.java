package com.springframework.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "My greeting service welcome---Constructor";
    }
}
