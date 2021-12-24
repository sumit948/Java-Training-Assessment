package com.example.employeeonetomany.Week3.employeeonetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeonetomany.Week3.employeeonetomany.entitys.Employee;
import com.example.employeeonetomany.Week3.employeeonetomany.repository.EmployeeRepository;

@RestController
public class EmployeeController {
		@Autowired
		private EmployeeRepository empRepo;
		
		@GetMapping("/get-employees")
		public List<Employee> getEmployee(@RequestBody Employee emp) {
			return empRepo.findAll();
		}
		
		
		@PostMapping("/create-employee")
		public Employee createEmployee(@RequestBody Employee emp) {
			return empRepo.save(emp);
		}
		
		@PutMapping("/create-employee")
		public Employee updateEmployee(@RequestBody Employee emp) {
			Employee e = empRepo.save(emp);
			return e;
		}
		
		@DeleteMapping("/delete-employee")
		public String deleteEmployee(@RequestBody Employee emp) {
			empRepo.delete(emp);
			return "Employee Deleted";
		}
}
