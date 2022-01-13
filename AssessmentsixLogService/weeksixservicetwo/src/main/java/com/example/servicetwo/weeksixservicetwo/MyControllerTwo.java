package com.example.servicetwo.weeksixservicetwo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyControllerTwo {
	private static final Logger mylog = Logger.getLogger(MyControllerTwo.class.getName());
	
	@GetMapping("/servicetwo")
	private String threemethod() {
		mylog.log(Level.INFO, "Servce Two");
        return "Welcome Service Two";
	}
	
	@GetMapping("/servicetwoemployee")
	private String getempdata() {
		String str = "http://localhost:9092/employeeone";
		RestTemplate resttemp = new RestTemplate();
		String result = resttemp.getForObject(str, String.class);
		return result;
	}
}	
