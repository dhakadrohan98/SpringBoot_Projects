package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCore1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCore1Application.class, args);
		Object obj1 = ctx.getBean("emp");
		System.out.println(obj1);
//		
//		Object obj2 = ctx.getBean("emp");
//		System.out.println(obj2);
//		
//		Object obj3 = ctx.getBean("emp");
//		System.out.println(obj3);
	}

}
