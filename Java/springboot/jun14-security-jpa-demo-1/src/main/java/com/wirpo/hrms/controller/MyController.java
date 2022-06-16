package com.wirpo.hrms.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wirpo.hrms.entity.Customer;

@Controller
public class MyController {

	@GetMapping("/")
	public String home(ModelMap model)
	{
		//can we obtain the security context, so that we can find the user details
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		System.out.println(auth.getPrincipal());
		model.addAttribute("customer", auth.getPrincipal());
		return "index";
	}
	
	@GetMapping("/showSignup")
	public String showSignUp(@ModelAttribute("customer")Customer customer)
	{
		return "signup";
	}
	
	@GetMapping("/showLogin")
	public String showLogin()
	{
		return "login";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi()
	{
		return "hi";
	}
	

	
}
