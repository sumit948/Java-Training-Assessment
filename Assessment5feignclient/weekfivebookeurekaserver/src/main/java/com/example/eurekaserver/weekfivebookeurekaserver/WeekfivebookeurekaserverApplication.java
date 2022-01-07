package com.example.eurekaserver.weekfivebookeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeekfivebookeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekfivebookeurekaserverApplication.class, args);
	}

}
