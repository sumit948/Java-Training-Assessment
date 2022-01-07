package com.example.bookconsumer.weekfivebookconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.example.bookconsumer.weekfivebookconsumer.DTO.BookConsumer;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WeekfivebookconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekfivebookconsumerApplication.class, args);
	}

	@Bean
	public BookConsumer consumer() {
		return new BookConsumer();
	}
	
}
