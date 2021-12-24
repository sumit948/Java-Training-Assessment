package com.example.employeeonetomany.Week3.employeeonetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeonetomany.Week3.employeeonetomany.repository.EmployeePhoneRepository;

@RestController
public class EmployeePhoneController {
		@Autowired
		private EmployeePhoneRepository phoneRepo;
		
		
 }
