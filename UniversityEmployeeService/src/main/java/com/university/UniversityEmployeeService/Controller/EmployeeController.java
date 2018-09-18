package com.university.UniversityEmployeeService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.university.UniversityEmployeeService.Entity.DepartmentDTO;
import com.university.UniversityEmployeeService.Entity.Employee;
import com.university.UniversityEmployeeService.Repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private EmployeeProxy empProxy;
    @GetMapping("/employee/{empId}")
    public Optional<Employee>  getEmployee(@PathVariable  Integer empId){
        return repository.findById(empId);
    }
    
    @GetMapping("/employee")
    public List<Employee>  getAllEmployee(){
        return repository.findAll();
    }
    @PostMapping("/employee")
    public void  postEmployee(@RequestBody Employee emp){
    	Employee empReponse = empProxy.retrieveExchangeValue(emp.getDeptName());
    	if(empReponse ==null) {
    		DepartmentDTO dpt=new DepartmentDTO();
    		System.out.println(emp.getDeptName());
    		dpt.setDeptName(emp.getDeptName());
    		empProxy.addDepartment(dpt);
    	}
        repository.save(emp);
    }
}
