package com.springframework.demo;

import com.springframework.demo.controller.ConstructorInjectedController;
import com.springframework.demo.controller.Mycontroller;
import com.springframework.demo.controller.PropertyInjectedController;
import com.springframework.demo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ConcurrentModificationException;

@SpringBootApplication
public class SfgDiTtmApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiTtmApplication.class, args);

		Mycontroller mycontroller=(Mycontroller) ctx.getBean("mycontroller");
		String gree=mycontroller.sayHello();
		System.out.println("Hello>>>>>>>>>>>>>."+ gree);

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
