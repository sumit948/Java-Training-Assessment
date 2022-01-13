package com.example.servicethree.weeksixservicethree;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MyControllerThree {
private static final Logger mylog = Logger.getLogger(MyControllerThree.class.getName());
	
	@GetMapping("/servicethree")
	private String threemethod() {
		mylog.log(Level.INFO, "Service Three");
        return "Welcome Service Three!";
	}
	
	@GetMapping("/servicethreeemployee")
	private String getempdata() {
		String str = "http://localhost:9093/servicetwoemployee";
		RestTemplate resttemp = new RestTemplate();
		String result = resttemp.getForObject(str, String.class);
		return result;
	}
}
