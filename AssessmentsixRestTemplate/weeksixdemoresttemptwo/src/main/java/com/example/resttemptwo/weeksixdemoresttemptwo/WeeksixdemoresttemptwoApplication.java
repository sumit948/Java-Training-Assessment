package com.example.resttemptwo.weeksixdemoresttemptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeeksixdemoresttemptwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeeksixdemoresttemptwoApplication.class, args);
	}
    
	@Bean
	public RestTemplate resttemp() {
		return new RestTemplate();
	}
	
}
