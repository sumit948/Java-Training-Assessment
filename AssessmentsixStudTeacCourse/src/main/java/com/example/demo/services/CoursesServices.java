package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Coureses;

import com.example.demo.repo.CourseseRepository;


@Service
public class CoursesServices {
	
	 @Autowired
	 private CourseseRepository courRepo;
	 
	 public Coureses create(Coureses cus) {
		// TODO Auto-generated method stub
				return courRepo.save(cus);
			}

			public Coureses updateCall(Coureses cus) {
		// TODO Auto-generated method stub
				return courRepo.save(cus);
			}

			public void deleteCall(Coureses cus) {
				courRepo.delete(cus);
			}

			public List<Coureses> getCall() {
		// TODO Auto-generated method stub
				return courRepo.findAll();
			}

}
