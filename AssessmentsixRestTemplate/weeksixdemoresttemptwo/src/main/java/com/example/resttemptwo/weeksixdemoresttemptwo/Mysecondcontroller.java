package com.example.resttemptwo.weeksixdemoresttemptwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Mysecondcontroller {
	@GetMapping("/secondproject")
	private String getsecondcall() {
		String myurl = "http://localhost:9092/helloworld";
		RestTemplate resttemp = new RestTemplate();
		String result = resttemp.getForObject(myurl, String.class);
		return result;
	}
	
	@GetMapping("/personclass")
	private Person getPersonData() {
		String myurltwo = "http://localhost:9092/projectoneperson";
		RestTemplate resttemp = new RestTemplate();
		Person person = resttemp.getForObject(myurltwo, Person.class);
		return person;
	}
}
