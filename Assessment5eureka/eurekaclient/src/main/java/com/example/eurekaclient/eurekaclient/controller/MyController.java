package com.example.eurekaclient.eurekaclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/client")
public class MyController {

	@GetMapping("/show")
	public String getMsg() {
	return "client run sucessful";
	}
}
