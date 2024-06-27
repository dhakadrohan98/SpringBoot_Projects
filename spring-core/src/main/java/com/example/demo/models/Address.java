package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("${state}")
	private String state;
	@Value("${city}")
	private String city;
	@Value("${pin}")
	private int pin;
	
	Address() {
		System.out.println("Address() object is created");
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
