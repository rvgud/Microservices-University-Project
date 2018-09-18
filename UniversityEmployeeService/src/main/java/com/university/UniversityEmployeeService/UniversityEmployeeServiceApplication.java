package com.university.UniversityEmployeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.university.UniversityEmployeeService.Controller.EmployeeProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses =EmployeeProxy.class)
public class UniversityEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityEmployeeServiceApplication.class, args);
	}
}
