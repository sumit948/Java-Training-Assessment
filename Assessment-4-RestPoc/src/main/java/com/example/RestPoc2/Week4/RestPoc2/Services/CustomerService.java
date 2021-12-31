package com.example.RestPoc2.Week4.RestPoc2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Customers;
import com.example.RestPoc2.Week4.RestPoc2.Repositorys.CustomersRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomersRepository custRepo;

	public Customers create(Customers sf) {
		// TODO Auto-generated method stub
		return custRepo.save(sf);
	}

	public Customers updateCall(Customers sf) {
		// TODO Auto-generated method stub
		return custRepo.save(sf);
	}

	public void deleteCall(Customers sf) {
		// TODO Auto-generated method stub
		custRepo.delete(sf);
	}

	public List<Customers> getCall() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}
}	
