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
import com.example.RestPoc2.Week4.RestPoc2.Entitys.Stores;
import com.example.RestPoc2.Week4.RestPoc2.Services.StoresService;

@RestController
@RequestMapping("/store")
public class StoreController {
	@Autowired
	private StoresService stServ;
	
	@PostMapping("/create")
	private Stores createCall(@RequestBody Stores sf) {
		return stServ.create(sf);
	}
	
	@PutMapping("/update")
	private Stores updateCall(@RequestBody Stores sf) {
		return stServ.updateCall(sf);
	}
	
	@DeleteMapping("/delete")
	private String deleteCall(@RequestBody Stores sf) {
		stServ.deleteCall(sf);
		return "Deleted";
	}
	
	@GetMapping("/get-allData")
	private List<Stores> getCall(){
		return stServ.getCall();
	}
}
