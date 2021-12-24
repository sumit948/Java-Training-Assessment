package com.example.employeeonetomany.Week3.employeeonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeonetomany.Week3.employeeonetomany.entitys.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
