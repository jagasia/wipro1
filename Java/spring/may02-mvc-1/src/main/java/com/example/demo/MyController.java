package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String home(ModelMap model)
	{
		model.addAttribute("name", "Siva");
		return "index";
	}
	
	@GetMapping("/showLogin")
	public String showLoginPage()
	{
		return "login";
	}
	
	@PostMapping("/validateLogin")
	public String validateLogin(AuthRequest authRequest, ModelMap model)
	{
		System.out.println("Received: "+authRequest.getUsername()+" and "+authRequest.getPassword());
		if(authRequest.getUsername().equals(authRequest.getPassword()))
		{
			//success
			model.addAttribute("status","success");
		}else
		{
			model.addAttribute("status","failure");
		}
		return "result";
	}
	
	@PostMapping("/validateLogin2")
	public String validateLogin2(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap model)
	{
		System.out.println("Received: "+username+" and "+password);
		if(username.equals(password))
		{
			//success
			model.addAttribute("status","success");
		}else
		{
			model.addAttribute("status","failure");
		}
		return "result";
	}
}
