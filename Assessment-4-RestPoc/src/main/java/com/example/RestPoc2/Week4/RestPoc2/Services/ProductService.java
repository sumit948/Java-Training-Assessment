package com.example.RestPoc2.Week4.RestPoc2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Products;
import com.example.RestPoc2.Week4.RestPoc2.Repositorys.ProductsRepository;

@Service
public class ProductService {
	@Autowired
	private ProductsRepository prodRepo;

	public Products create(Products sf) {
		// TODO Auto-generated method stub
		return prodRepo.save(sf);
	}

	public Products updateCall(Products sf) {
		// TODO Auto-generated method stub
		return prodRepo.save(sf);
	}

	public void deleteCall(Products sf) {
		// TODO Auto-generated method stub
		prodRepo.delete(sf);
	}

	public List<Products> getCall() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}
}
