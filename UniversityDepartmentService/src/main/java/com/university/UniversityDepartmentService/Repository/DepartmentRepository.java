package com.university.UniversityDepartmentService.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.UniversityDepartmentService.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {

	Optional<Department> findByDeptName(String depName);

}
