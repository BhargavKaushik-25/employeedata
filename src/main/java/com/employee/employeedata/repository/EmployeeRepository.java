package com.employee.employeedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeedata.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
