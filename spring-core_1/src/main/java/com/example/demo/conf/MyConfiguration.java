package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.demo.models.Address;
import com.example.demo.models.Employee;

@Configuration
public class MyConfiguration {
	
	@Bean("emps")
	@Scope("prototype")
	@Lazy
	public Employee getEmployee() {
		return new Employee("Raju", 23 , 48000, "programmer", getAddress());
	}
	
	@Bean("empc")
	public Employee getEmployee2() {
		Employee emp1 = new Employee();
		emp1.setName("Ritesh");
		emp1.setAge(26);
		return emp1;
	}
	
	@Bean("addrc")
	public Address getAddress2() {
		return new Address("Mumbai", "MH", 452001);
	}
	
	@Bean("addrs")
	public Address getAddress() {
		Address adrs1 = new Address();
		adrs1.setCity("Mumbai");
		adrs1.setState("MH");
		adrs1.setPin(452011);
		return adrs1;
	}
}
