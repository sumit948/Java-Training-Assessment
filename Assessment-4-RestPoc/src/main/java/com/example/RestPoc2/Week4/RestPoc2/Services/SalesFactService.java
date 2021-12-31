package com.example.RestPoc2.Week4.RestPoc2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.SalesFact;
import com.example.RestPoc2.Week4.RestPoc2.Repositorys.SaleFactRepository;

@Service
public class SalesFactService {
	@Autowired
	private SaleFactRepository sfRepo;

	public SalesFact create(SalesFact sf) {
		// TODO Auto-generated method stub
		return sfRepo.save(sf);
	}

	public SalesFact updateCall(SalesFact sf) {
		// TODO Auto-generated method stub
		return sfRepo.save(sf);
	}

	public void deleteCall(SalesFact sf) {
		sfRepo.delete(sf);	
	}

	public List<SalesFact> getCall() {
		// TODO Auto-generated method stub
		return sfRepo.findAll();
	}

	
}
