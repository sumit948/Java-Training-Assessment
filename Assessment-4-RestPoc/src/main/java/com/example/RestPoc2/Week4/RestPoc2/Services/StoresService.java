package com.example.RestPoc2.Week4.RestPoc2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Stores;
import com.example.RestPoc2.Week4.RestPoc2.Repositorys.StoresRepository;

@Service
public class StoresService {
	@Autowired
	private StoresRepository stRepo;

	public Stores create(Stores sf) {
		// TODO Auto-generated method stub
		return stRepo.save(sf);
	}

	public Stores updateCall(Stores sf) {
		// TODO Auto-generated method stub
		return stRepo.save(sf);
	}

	public void deleteCall(Stores sf) {
		// TODO Auto-generated method stub
		stRepo.delete(sf);
	}

	public List<Stores> getCall() {
		// TODO Auto-generated method stub
		return stRepo.findAll();
	}
}
