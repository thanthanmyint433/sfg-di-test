package com.springframework.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world--En";
    }
}
