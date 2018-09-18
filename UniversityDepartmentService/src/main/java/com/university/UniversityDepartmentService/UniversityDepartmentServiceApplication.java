package com.university.UniversityDepartmentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UniversityDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityDepartmentServiceApplication.class, args);
	}
}
