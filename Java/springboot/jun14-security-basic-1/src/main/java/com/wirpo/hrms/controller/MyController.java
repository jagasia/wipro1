package com.wirpo.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/product")
	public String showProductPage()
	{
		return "product";
	}
	
	@GetMapping("/customer")
	public String showCustomerPage()
	{
		return "customer";
	}
	
}
