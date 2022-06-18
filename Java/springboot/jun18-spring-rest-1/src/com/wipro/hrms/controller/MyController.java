package com.wipro.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping
	public String home()
	{
		return "Hello world";
	}
	
	@GetMapping("/hi")
	public String hi()
	{
		return "Hi";
	}
	
	
}