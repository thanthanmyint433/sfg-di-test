package com.springframework.demo;

import com.springframework.demo.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ConcurrentModificationException;

@SpringBootApplication
public class SfgDiTtmApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiTtmApplication.class, args);

		Mycontroller mycontroller=(Mycontroller) ctx.getBean("mycontroller");
        System.out.println("----PRimary Bean----------");
		System.out.println(mycontroller.sayHello());

		System.out.println("I 18 Controller");
		I18nController i18nController=(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

        System.out.println("----------PRoperty");
        PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
        String inject=propertyInjectedController.getGreeting();
        System.out.println("gretting>>>>>>>>>>>>>>>>>"+inject);

		System.out.println("Setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------Constructotr");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
