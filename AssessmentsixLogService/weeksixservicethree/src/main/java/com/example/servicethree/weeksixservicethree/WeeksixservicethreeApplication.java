package com.example.servicethree.weeksixservicethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeeksixservicethreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeeksixservicethreeApplication.class, args);
	}

	@Bean
	public RestTemplate resttemp() {
		return new RestTemplate();
	}
	
}
