package com.employee.employeedata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(EmployeeRepository repo) {
		return args -> {
			repo.save(new Employee(1, "Abhishek", 30, 50000));
			repo.save(new Employee(2, "Arjun", 40, 80000));
			repo.save(new Employee(3, "Ajay", 33, 45000));
		};
	}

}
