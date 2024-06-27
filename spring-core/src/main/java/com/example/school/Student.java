package com.example.school;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	
	@Value("pintu")
	private String name;
	@Value("8")
	private int age;
	@Value("3")
	private int standard;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", standard=" + standard + "]";
	}
	
	
}
