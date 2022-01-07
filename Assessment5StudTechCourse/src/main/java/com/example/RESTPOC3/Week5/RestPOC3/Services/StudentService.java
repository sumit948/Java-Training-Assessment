package com.example.RESTPOC3.Week5.RestPOC3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RESTPOC3.Week5.RestPOC3.Entitys.Students;
import com.example.RESTPOC3.Week5.RestPOC3.Resposiotries.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository stRepo;

	public Students createCall(Students st) {
		// TODO Auto-generated method stub
		return stRepo.save(st);
	}

	public Students updateCall(Students st) {
		// TODO Auto-generated method stub
		return stRepo.save(st);
	}

	public void deleteCall(Students st) {
		// TODO Auto-generated method stub
		stRepo.delete(st);
	}

	public List<Students> getCall(Students st) {
		// TODO Auto-generated method stub
		return stRepo.findAll();
	}
}
