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

import com.example.RestPoc2.Week4.RestPoc2.Entitys.Dates;
import com.example.RestPoc2.Week4.RestPoc2.Services.DateService;

@RestController
@RequestMapping("/date")
public class DateController {
	@Autowired
	private DateService datServ;
	
	@PostMapping("/create")
		private Dates createCall(@RequestBody Dates sf) {
			return datServ.create(sf);
		}
		
		@PutMapping("/update")
		private Dates updateCall(@RequestBody Dates sf) {
			return datServ.updateCall(sf);
		}
		
		@DeleteMapping("/delete")
		private String deleteCall(@RequestBody Dates sf) {
			datServ.deleteCall(sf);
			return "Deleted";
		}
		
		@GetMapping("/get-allData")
		private List<Dates> getCall(){
			return datServ.getCall();
		}
}
