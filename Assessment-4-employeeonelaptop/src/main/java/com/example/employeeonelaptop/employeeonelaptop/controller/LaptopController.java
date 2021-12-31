package com.example.employeeonelaptop.employeeonelaptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeonelaptop.employeeonelaptop.entitys.Employee;
import com.example.employeeonelaptop.employeeonelaptop.entitys.Laptop;
import com.example.employeeonelaptop.employeeonelaptop.repository.LaptopRepository;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	@Autowired
	private LaptopRepository lapRepo;
	
	@GetMapping("/get-employeeswithlaptop")
	public List<Laptop> getEmployee(@RequestBody Laptop lap) {
		return lapRepo.findAll();
	}
	
	
	@PostMapping("/create-employeewithlaptop")
	public Laptop createEmployee(@RequestBody Laptop lap) {
		return lapRepo.save(lap);
	}
	
	@PutMapping("/create-employeewithlaptop")
	public Laptop updateEmployee(@RequestBody Laptop lap) {
		Laptop l = lapRepo.save(lap);
		return l;
	}
	
	@DeleteMapping("/delete-employeewithlaptop")
	public String deleteEmployee(@RequestBody Laptop lap) {
		lapRepo.delete(lap);
		return "Employee Deleted";
	}
}
