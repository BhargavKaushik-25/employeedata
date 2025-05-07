package com.employee.employeedata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
	    Optional<Employee> employee = repo.findById(id);
	    return employee.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.notFound().build());
	}
}
