package com.example.RESTPOC3.Week5.RestPOC3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Courses;
import com.example.RESTPOC3.Week5.RestPOC3.Resposiotries.CourseReposiotry;

@Service
public class CourseService {
	@Autowired
	private CourseReposiotry courseRepo;

	public Courses createCall(Courses st) {
		// TODO Auto-generated method stub
		return courseRepo.save(st);
	}

	public Courses updateCall(Courses st) {
		// TODO Auto-generated method stub
		return courseRepo.save(st);
	}

	public void deleteCall(Courses st) {
		courseRepo.delete(st);	
	}

	public List<Courses> getCall(Courses st) {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}
}
