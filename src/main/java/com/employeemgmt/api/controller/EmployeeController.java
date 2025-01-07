/**
 * 
 */
package com.employeemgmt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemgmt.api.domain.Employee;
import com.employeemgmt.api.service.EmployeeService;

/**
 * 
 */
@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/create")
	public void createEmployee(Employee employee) {
		employeeService.createEmployee(employee);	
	}
	
	@GetMapping(value = "/checkHealth")
	public void checkHealth() {
		employeeService.checkDeptServiceHealth();	
	}
	
}
