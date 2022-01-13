package com.example.restemp.weeksixresttemp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
		
		@RequestMapping("/helloworld")
		public String gethello() {
			return "Hello World - This is from another project";
		}
		
		@GetMapping("/projectoneperson")
		public Person getData() {
			Person p = new Person();
			p.setPersonName("Sumit");
			p.setPersonAdd("Kolhapur");
			return p;
		}
}	
