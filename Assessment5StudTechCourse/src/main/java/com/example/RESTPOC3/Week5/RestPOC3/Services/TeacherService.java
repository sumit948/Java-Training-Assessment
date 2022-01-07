package com.example.RESTPOC3.Week5.RestPOC3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Teacher;
import com.example.RESTPOC3.Week5.RestPOC3.Resposiotries.TeacherReposiotry;

@Service
public class TeacherService {
	@Autowired
	private TeacherReposiotry teachRepo;

	public Teacher createCall(Teacher st) {
		// TODO Auto-generated method stub
		return teachRepo.save(st);
	}

	public Teacher updateCall(Teacher st) {
		// TODO Auto-generated method stub
		return teachRepo.save(st);
	}

	public void deleteCall(Teacher st) {
		// TODO Auto-generated method stub
		teachRepo.delete(st);
	}

	public List<Teacher> getCall(Teacher st) {
		// TODO Auto-generated method stub
		return teachRepo.findAll();
	}
}
