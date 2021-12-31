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
import com.example.RestPoc2.Week4.RestPoc2.Entitys.Products;
import com.example.RestPoc2.Week4.RestPoc2.Services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService prodServ;
	
	@PostMapping("/create")
		private Products createCall(@RequestBody Products sf) {
			return prodServ.create(sf);
		}
		
		@PutMapping("/update")
		private Products updateCall(@RequestBody Products sf) {
			return prodServ.updateCall(sf);
		}
		
		@DeleteMapping("/delete")
		private String deleteCall(@RequestBody Products sf) {
			prodServ.deleteCall(sf);
			return "Deleted";
		}
		
		@GetMapping("/get-allData")
		private List<Products> getCall(){
			return prodServ.getCall();
		}
}
