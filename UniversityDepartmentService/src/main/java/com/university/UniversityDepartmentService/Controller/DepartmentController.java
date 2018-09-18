package com.university.UniversityDepartmentService.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.UniversityDepartmentService.Entity.Department;
import com.university.UniversityDepartmentService.Entity.DepartmentDTO;
import com.university.UniversityDepartmentService.Repository.DepartmentRepository;

@RestController
public class DepartmentController {
	 @Autowired
	  private DepartmentRepository repository;
	 
	 @GetMapping("/department/{depName}")
	 public Optional<Department>  getDepartment(@PathVariable  String depName){
		 return repository.findByDeptName(depName);
	 }
	 @PostMapping("/department")
	 public void  postDepartment(@RequestBody DepartmentDTO dept){
		 Department dep =new Department();
		 dep.setDeptName(dept.getDeptName());
		 repository.save(dep);
	 }	
}
