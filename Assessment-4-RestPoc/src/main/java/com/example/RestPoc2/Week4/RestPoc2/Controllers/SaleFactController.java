package com.example.RestPoc2.Week4.RestPoc2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestPoc2.Week4.RestPoc2.Entitys.SalesFact;
import com.example.RestPoc2.Week4.RestPoc2.Services.SalesFactService;

@RestController
@RequestMapping("/salefact")
public class SaleFactController {
		@Autowired
		private SalesFactService sfServ;
		
		@PostMapping("/create")
		private SalesFact createCall(@RequestBody SalesFact sf) {
			return sfServ.create(sf);
		}
		
		@PutMapping("/update")
		private SalesFact updateCall(@RequestBody SalesFact sf) {
			return sfServ.updateCall(sf);
		}
		
		@DeleteMapping("/delete")
		private String deleteCall(@RequestBody SalesFact sf) {
			sfServ.deleteCall(sf);
			return "Deleted";
		}
		
		@GetMapping("/get-allData")
		private List<SalesFact> getCall(){
			return sfServ.getCall();
		}
}
