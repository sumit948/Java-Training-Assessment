package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentServices {

	 @Autowired
	 private StudentRepository studeRepo;
	 
	 public Student create(Student stu) {
		// TODO Auto-generated method stub
				return studeRepo.save(stu);
			}

			public Student updateCall(Student cf) {
		// TODO Auto-generated method stub
				return studeRepo.save(cf);
			}

			public void deleteCall(Student cf) {
				studeRepo.delete(cf);
			}

			public List<Student> getCall() {
		// TODO Auto-generated method stub
				return studeRepo.findAll();
			}
}
