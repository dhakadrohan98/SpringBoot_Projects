package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmpDAO;
import com.example.demo.entities.Employee;

import java.util.*;

@RestController
public class MyEMPController {
	
	@Autowired
	EmpDAO dao;
	
	@GetMapping("/employees")
	public List<Employee> getALLEmployees() {
		return dao.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return dao.findById(id);
	}
	
	@PostMapping("/employees")
	public String addEmployees(@RequestBody Employee e) {
		if(dao.existsById(e.getEid())) {
			return "Sorry! employee id already exists";
		}
		dao.save(e);
		return "record is inserted successfully";
	}
	
	@PutMapping("/employees")
	public String updateEmployees(@RequestBody Employee e) {
		if(!dao.existsById(e.getEid())) {
			return "Sorry! employee is not present.";
		}
		dao.save(e);
		return "record is updated successfully!";
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		if(!dao.existsById(id)) {
			return "sorry, No Employee exists";
		}
		dao.deleteById(id);
		return "Employee with given id is deleted successfully";
	}
	
	@GetMapping("/employees/role")
	public List<Employee> getByDesignation(String designation) {
		return dao.getByDesignation(designation);
	}
	
	@GetMapping("/employees/above")
	public List<Employee> aboveAge(int age) {
		return dao.findByAgeGreaterThan(age);
	}
	
	@GetMapping("/employees/below")
	public List<Employee> belowSalary(int salary) {
		return dao.findBySalaryLessThan(salary);
	}
	
	@GetMapping("/employees/custom")
	public List<Employee> customQuery(String designation) {
		return dao.myCustomMethod(designation);
	}
}
