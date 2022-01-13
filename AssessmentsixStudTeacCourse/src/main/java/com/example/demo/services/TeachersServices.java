package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Teachers;
import com.example.demo.repo.TeachersRepository;

@Service
public class TeachersServices {
	 @Autowired
	 private TeachersRepository techrepo;
	 
	 public Teachers create(Teachers tech) {
			// TODO Auto-generated method stub
					return techrepo.save(tech);
				}

				public Teachers updateCall(Teachers tech) {
			// TODO Auto-generated method stub
					return techrepo.save(tech);
				}

				public void deleteCall(Teachers tech ) {
					techrepo.delete(tech);
				}

				public List<Teachers> getCall() {
			// TODO Auto-generated method stub
					return techrepo.findAll();
				}
}
