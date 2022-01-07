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

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Teacher;
import com.example.RESTPOC3.Week5.RestPOC3.Services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService teachServ;
	
		@PostMapping("/create-teacher")
		private Teacher createCall(@RequestBody Teacher st)
		{
			return teachServ.createCall(st);
		}
		
		@PutMapping("/update-teacher")
		private Teacher updateCall(@RequestBody Teacher st)
		{
			return teachServ.updateCall(st);
		}
		
		@DeleteMapping("/delete-teacher")
		private String deleteCall(@RequestBody Teacher st) {
			teachServ.deleteCall(st);
			return " Deleted Teacher";
		}
		
		@GetMapping("/get-all-teacher")
		private List<Teacher> getCall(@RequestBody Teacher st){
			return teachServ.getCall(st);
		}
}
