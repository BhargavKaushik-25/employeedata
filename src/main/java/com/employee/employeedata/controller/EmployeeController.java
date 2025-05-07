package com.employee.employeedata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
}
