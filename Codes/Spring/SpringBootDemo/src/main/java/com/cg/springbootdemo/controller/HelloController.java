package com.cg.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hi from Spring Boot app";
	}
	
	@RequestMapping("/mycity")
	public String myCity() {
		return "I am from Kolkata";
	}
}