package com.springframework.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingServiceImpl implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World------Primary Bean";
    }
}
