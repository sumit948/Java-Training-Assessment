package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentServices;



@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	public StudentServices stuServ;

	@PostMapping("/create")
	public Student createCall(@RequestBody Student stu) {
		return stuServ.create(stu);
	}

	@PutMapping("/update")
	public Student updateCall(@RequestBody Student stu) {
		return stuServ.updateCall(stu);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Student stu) {
		stuServ.deleteCall(stu);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	private List<Student> getCall() {
		return stuServ.getCall();
	}
}
