package com.university.UniversityEmployeeService.Controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.university.UniversityEmployeeService.Entity.DepartmentDTO;
import com.university.UniversityEmployeeService.Entity.Employee;

@FeignClient(value="department-service")
@RibbonClient
public interface EmployeeProxy {
	@GetMapping("/department/{depName}")
	  public Employee retrieveExchangeValue(@PathVariable("depName") String depName);
	@PostMapping("/department")
	  public Employee addDepartment(@RequestBody DepartmentDTO dpt);
}
