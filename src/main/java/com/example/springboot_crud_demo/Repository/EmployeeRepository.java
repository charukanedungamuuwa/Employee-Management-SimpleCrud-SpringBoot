package com.example.springboot_crud_demo.Repository;

import com.example.springboot_crud_demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
