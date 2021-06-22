package com.cg.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {

	@RequestMapping("/hi")
	public String hi() {
		return "Hi from the second controller";
	}
	
}
