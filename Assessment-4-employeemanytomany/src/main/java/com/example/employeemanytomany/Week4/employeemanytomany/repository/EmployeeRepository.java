package com.example.employeemanytomany.Week3.employeemanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanytomany.Week3.employeemanytomany.Entitys.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
