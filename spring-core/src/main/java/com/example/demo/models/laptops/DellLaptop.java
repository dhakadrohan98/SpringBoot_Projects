package com.example.demo.models.laptops;

import org.springframework.stereotype.Component;

@Component
public class DellLaptop implements Laptop {

	@Override
	public void diplay() {
		System.out.println("hey! you have gotten dell laptop");
	}
}
