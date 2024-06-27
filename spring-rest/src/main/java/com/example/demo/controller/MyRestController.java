package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;

@RestController
public class MyRestController {
	
	@GetMapping("/request")
	public String getDemo() {
		return "it is used to get the records";
	}
	
	@PostMapping("/request")
	public String postDemo() {
		return "it is used to post the records";
	}
	
	@RequestMapping(path="/request", method = {RequestMethod.PUT,RequestMethod.PATCH})
	public String putDemo() {
		return "it is used to put the records";
	}
	
	@DeleteMapping("/request")
	public String deleteDemo() {
		return "it is used to delete the records";
	}
	
	//@RequestParam
	
	@GetMapping("/request/{name}/{age}")
	public String pathParameter(@PathVariable String name, @PathVariable String age) {
		System.out.println("Path parameter");
		return "Name is " + name + " and age is " + age;
	}
	
	@GetMapping("/request/body")
	public String bodyParameter(@RequestBody Employee e) {
		System.out.println("---Body parameter starts----");
		System.out.println("Name: " + e.getName());
		System.out.println("Age: " + e.getAge());
		System.out.println("---Body parameter end----");
		return "Name is " + e.getName() + " and age is " + e.getAge();
	}
	
//	@GetMapping("/rest")
//	public String welcome2() {
//		return "Welcome to REST APIs";
//	}
//	
//	@GetMapping("/hi")
//	public String welcome3() {
//		return "Hi buddy, hope you're doing well";
//	}
//	
	@GetMapping(path="content/negotiation", produces="text/xml")
	public String welcome4() {
		return "<html><head><title>Content Negotiation</title></head>"
				+"<body><div>"
				+"<h1>Welcome to rest services</h1>"
				+ "</div></body>"
				+"</html>";
	}
	
	
}
