package com.university.UniversityEmployeeService.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.university.UniversityEmployeeService.Entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
