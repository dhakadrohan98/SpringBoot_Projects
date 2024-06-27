package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.demo.models.laptops.Laptop;

@Component("emp")
@Scope("singleton")
@Lazy
public class Employee {

	@Value("${user}")
	private String name;
	@Value("${age}")
	private int age;
	@Value("${salary}")
	private int salary;
	@Value("${role}")
	private String designation;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("mac")
	private Laptop laptop;
	
	Employee() {
		System.out.println("Employee() object is created");
	}

	@Override
	public String toString() {
		laptop.diplay();
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation
				+ ", address=" + address + ", laptop=" + laptop + "]";
	}
}
