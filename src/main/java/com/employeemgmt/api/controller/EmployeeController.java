/**
 * 
 */
package com.employeemgmt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemgmt.api.domain.Employee;
import com.employeemgmt.api.service.EmployeeService;

/**
 * 
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/create")
	public void createEmployee(Employee employee) {
		employeeService.createEmployee(employee);	
	}
	
}
