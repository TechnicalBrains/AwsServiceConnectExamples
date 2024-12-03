package com.employeemgmt.api.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employeemgmt.api.domain.Employee;

/**
 * 
 */
@Service
public class EmployeeService {

	@Autowired
	RestTemplate restTemplate;
	
	public String createEmployee(Employee employee) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://department-mgmt-service.dept-mgmt-ns:8080/api/department/create",
				new HashMap<>(),String.class);
		System.out.println(" Response Status Code :  "+response.getStatusCode().value());
		System.out.println(" Response Body:  "+response.getBody());
		return response.getBody();
	}
}
