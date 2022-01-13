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

import com.example.demo.entity.Coureses;

import com.example.demo.services.CoursesServices;

@RestController
@RequestMapping("/course")
public class CouresesController {
	@Autowired
	public  CoursesServices courseServ;
	
	@PostMapping("/create")
	public Coureses createCall(@RequestBody Coureses cour) {
		return courseServ.create(cour);
	}

	@PutMapping("/update")
	public Coureses updateCall(@RequestBody Coureses cour) {
		return courseServ.updateCall(cour);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Coureses cour) {
		courseServ.deleteCall(cour);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	private List<Coureses> getCall() {
		return courseServ.getCall();
	}
}
