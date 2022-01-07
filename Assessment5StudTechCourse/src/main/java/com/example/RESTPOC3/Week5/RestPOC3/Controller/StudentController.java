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

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Students;
import com.example.RESTPOC3.Week5.RestPOC3.Services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
		@Autowired
		private StudentService stServ;
		
		@PostMapping("/create-student")
		private Students createCall(@RequestBody Students st)
		{
			return stServ.createCall(st);
		}
		
		@PutMapping("/update-student")
		private Students updateCall(@RequestBody Students st)
		{
			return stServ.updateCall(st);
		}
		
		@DeleteMapping("/delete-student")
		public String deleteCall(@RequestBody Students st) {
			stServ.deleteCall(st);
			return "Deleted Student";
		}
		
		@GetMapping("/get-all-students")
		private List<Students> getCall(@RequestBody Students st){
			return stServ.getCall(st);
		}
}
