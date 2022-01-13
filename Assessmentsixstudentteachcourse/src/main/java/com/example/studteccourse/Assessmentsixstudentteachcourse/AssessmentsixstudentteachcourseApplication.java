package com.example.studteccourse.Assessmentsixstudentteachcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AssessmentsixstudentteachcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentsixstudentteachcourseApplication.class, args);
	}

}
