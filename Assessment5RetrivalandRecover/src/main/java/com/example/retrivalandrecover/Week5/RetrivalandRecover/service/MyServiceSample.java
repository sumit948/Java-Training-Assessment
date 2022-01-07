package com.example.retrivalandrecover.Week5.RetrivalandRecover.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class MyServiceSample {
	@Retryable(value = Exception.class, maxAttempts = 2)
    public String serviceInvoked() {
        return "This is Sample Service Invoked";
    }
    @Recover
    public String serviceRecovered() {
        return "This is Sample Service Recovered";
    }
}
