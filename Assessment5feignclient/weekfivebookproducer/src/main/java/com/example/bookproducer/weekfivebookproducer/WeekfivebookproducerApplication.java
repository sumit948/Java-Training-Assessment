package com.example.bookproducer.weekfivebookproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeekfivebookproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekfivebookproducerApplication.class, args);
	}

}
