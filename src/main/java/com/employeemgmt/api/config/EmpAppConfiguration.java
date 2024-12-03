/**
 * 
 */
package com.employeemgmt.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 */
@Configuration
public class EmpAppConfiguration {

    @Bean
    RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
