package com.example.studteccourse.Assessmentsixstudentteachcourse.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studteccourse.Assessmentsixstudentteachcourse.entitys.Student;
import com.example.studteccourse.Assessmentsixstudentteachcourse.repository.StudentRepository;

@RestController
public class MyController {
	@Autowired
	private StudentRepository studRepo;
	
	@PostMapping("/create-student")
	public Student createStudent(@RequestBody Student stud) {
		return studRepo.save(stud);
	}
	
	@PutMapping("/create-student")
	public Student updateStudent(@RequestBody Student stud) {
		return studRepo.save(stud);
	}
	
	@DeleteMapping("/delete-student")
	public String deleteStudnent(@RequestBody Student con) {
		studRepo.delete(con);
		return "Student Deleted";
	}
	
	@GetMapping("/get-allStudents")
	public List<Student> getStudent(){
		return studRepo.findAll();
	}
	
	private static final Logger LOG = Logger.getLogger(MyController.class.getName());

    @RequestMapping("/slueth")
       public String index() {
    	 //insted of writing System.out.println use Log.log
          LOG.log(Level.INFO, "Index API is calling");  //display while executed
          return "Welcome Sleuth!";
       }
}
