package com.example.autuator.Week4.checkhealthusingactuator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcutatorController {
	
	@Value("${name}")
	private String name;
	
	@GetMapping("/get-name")
	public String getName() {
		return name + " This is you";
	}
}
