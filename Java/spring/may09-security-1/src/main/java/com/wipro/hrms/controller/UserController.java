package com.wipro.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.wipro.hrms.config.MyUserDetailsService;

@Controller
public class UserController {
	@Autowired
	private MyUserDetailsService us;
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String showLogin()
	{
		return "login";
	}
	
	@GetMapping("/signup")
	public String showSignup()
	{
		return "signup";
	}
}
