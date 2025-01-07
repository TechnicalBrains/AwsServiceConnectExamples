package com.employeemgmt.api.service;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employeemgmt.api.domain.Employee;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Service
@Slf4j
public class EmployeeService {

	@Autowired
	RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	public String createEmployee(Employee employee) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://dept-mgm-svc-dns:8080/api/department/create",
				new HashMap<>(),String.class);
		System.out.println(" Response Status Code :  "+response.getStatusCode().value());
		System.out.println(" Response Body:  "+response.getBody());
		return response.getBody();
	}
	
	public String checkDeptServiceHealth() {
		String response = restTemplate.getForObject("http://dept-mgm-svc-dns:8080/api/department/actuator/health",String.class);
		logger.info(" Response Status Code {}  ",response);
		return response;
	}
}
