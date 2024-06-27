package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.school", "com.example.demo"})
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext apctx =  SpringApplication.run(SpringCoreApplication.class, args);
		Object bean1 = apctx.getBean("emp");
		System.out.println(bean1);
		
		Object bean2 = apctx.getBean("stud");
		System.out.println(bean2);
	}
}
