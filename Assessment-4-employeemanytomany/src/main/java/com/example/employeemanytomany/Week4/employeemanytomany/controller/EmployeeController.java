package com.example.employeemanytomany.Week3.employeemanytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanytomany.Week3.employeemanytomany.Entitys.Employee;
import com.example.employeemanytomany.Week3.employeemanytomany.repository.EmployeeRepository;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@RestController
public class EmployeeController {
		@Autowired
		private EmployeeRepository empRepo;
		
		@PostMapping("/create-employee")
		public Employee createEmployee(@RequestBody Employee emp) {
			return empRepo.save(emp);
		}
		
		@PutMapping("/create-employee")
		public Employee updateEmployee(@RequestBody Employee emp) {
			return empRepo.save(emp);
		}
		
		@DeleteMapping("/delete-employee")
		public String deleteEmployee(@RequestBody Employee emp) {
			empRepo.delete(emp);
			return "Employee Deleted";
		}
		
		@GetMapping("get-all-Employees")
		public List<Employee> getEmployees(@RequestBody Employee emp){
			return empRepo.findAll();
		}
}
