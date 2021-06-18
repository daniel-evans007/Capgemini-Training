package com.cg.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
	String message = "Welcome to Capgemini!!!";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("In HelloWorld Controller");
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("messagetojsp",message);
		return mv;
	}
}