package com.example.retrivalandrecover.Week5.RetrivalandRecover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.retrivalandrecover.Week5.RetrivalandRecover.service.MyServiceSample;

@RestController
public class MySampleController {
	@Autowired
    private MyServiceSample myServiceSample;
 
    @GetMapping("/retry")
    @ExceptionHandler({ Exception.class })
    public String validateSPringRetryCapability() {
 
        System.out.println("Inside RestController mathod..");
 
        return myServiceSample.serviceInvoked();
    }
}
