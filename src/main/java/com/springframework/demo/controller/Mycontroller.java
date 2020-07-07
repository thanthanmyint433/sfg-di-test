package com.springframework.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Mycontroller {
    public String sayHello(){
        System.out.println("Hello World!");
        return "Than Than Myint";
    }
}
