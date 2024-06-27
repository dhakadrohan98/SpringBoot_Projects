package com.example.demo.models.laptops;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LenovoLaptop implements Laptop {
	
	@Override
	public void diplay() {
		System.out.println("hey! you have gotten Lenovo laptop");
	}
}
