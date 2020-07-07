package com.springframework.demo;

import com.springframework.demo.controller.Mycontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiTtmApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiTtmApplication.class, args);
		Mycontroller mycontroller=(Mycontroller) ctx.getBean("mycontroller");
		String gree=mycontroller.sayHello();
		System.out.println("Hello>>>>>>>>>>>>>."+ gree);
	}

}
