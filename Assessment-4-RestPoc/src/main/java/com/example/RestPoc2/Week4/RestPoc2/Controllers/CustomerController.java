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

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Customers;
import com.example.RestPoc2.Week4.RestPoc2.Services.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired CustomerService custServ;
	
	@PostMapping("/create")
		private Customers createCall(@RequestBody Customers sf) {
			return custServ.create(sf);
		}
		
		@PutMapping("/update")
		private Customers updateCall(@RequestBody Customers sf) {
			return custServ.updateCall(sf);
		}
		
		@DeleteMapping("/delete")
		private String deleteCall(@RequestBody Customers sf) {
			custServ.deleteCall(sf);
			return "Deleted";
		}
		
		@GetMapping("/get-allData")
		private List<Customers> getCall(){
			return custServ.getCall();
		}
}
