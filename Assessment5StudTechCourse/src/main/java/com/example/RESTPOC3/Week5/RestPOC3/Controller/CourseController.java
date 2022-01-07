package com.example.RESTPOC3.Week5.RestPOC3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Courses;
import com.example.RESTPOC3.Week5.RestPOC3.Services.CourseService;

@RestController
@RequestMapping
public class CourseController {
	@Autowired
	private CourseService cursServ;
	
	@PostMapping("/create-course")
		private Courses createCall(@RequestBody Courses st)
		{
			return cursServ.createCall(st);
		}
		
		@PutMapping("/update-course")
		private Courses updateCall(@RequestBody Courses st)
		{
			return cursServ.updateCall(st);
		}
		
		@DeleteMapping("/delete-course")
		private String deleteCall(@RequestBody Courses st) {
			cursServ.deleteCall(st);
			return " Deleted Course";
		}
		
		@GetMapping("/get-all-course")
		private List<Courses> getCall(@RequestBody Courses st){
			return cursServ.getCall(st);
		}
	
}
