/**
 * 
 */
package com.employeemgmt.api.domain;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

/**
 * 
 */
@Data
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String firstName;
	private String lastName;
	private String designation;
	private Map<String, String> department;
	
}
