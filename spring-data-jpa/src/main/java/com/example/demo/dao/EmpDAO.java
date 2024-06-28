package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

import com.example.demo.entities.Employee;

public interface EmpDAO extends JpaRepository<Employee, Integer> {
	
	public List<Employee> getByDesignation(String designation);
	public List<Employee> findByAgeGreaterThan(int age);
	public List<Employee> findBySalaryLessThan(int salary);
	
	@Query("from Employee where designation=?1 order by age desc")
	public List<Employee> myCustomMethod(String designation);
}
