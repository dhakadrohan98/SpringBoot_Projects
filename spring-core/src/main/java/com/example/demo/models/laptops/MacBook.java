package com.example.demo.models.laptops;

import org.springframework.stereotype.Component;

@Component("mac")
public class MacBook implements Laptop {

	@Override
	public void diplay() {
		System.out.println("you have got Apple mackbook");
	}

}
