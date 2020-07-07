package com.springframework.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World-Spanish";
    }
}
