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
import com.example.demo.entity.Teachers;
import com.example.demo.services.TeachersServices;


@RestController
@RequestMapping("/teacher")
public class TeachersController {

	@Autowired
	public TeachersServices techServ;

	@PostMapping("/create")
	public Teachers createCall(@RequestBody Teachers tech) {
		return techServ.create(tech);
	}

	@PutMapping("/update")
	public Teachers updateCall(@RequestBody Teachers tech) {
		return techServ.updateCall(tech);
	}

	@DeleteMapping("/delete")
	public String deleteCall(@RequestBody Teachers tech) {
		techServ.deleteCall(tech);
		return "Deleted";
	}

	@GetMapping("/get-allData")
	private List<Teachers> getCall() {
		return techServ.getCall();
	}
}