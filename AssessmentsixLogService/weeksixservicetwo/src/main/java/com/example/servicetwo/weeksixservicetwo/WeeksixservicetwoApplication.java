package com.example.servicetwo.weeksixservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeeksixservicetwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeeksixservicetwoApplication.class, args);
	}
	
	@Bean
	public RestTemplate resttemp() {
		return new RestTemplate();
	}
}
