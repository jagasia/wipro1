package com.wipro.ecom.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.ecom.model.User;
import com.wipro.ecom.model.UserDaoImpl;

@Controller
public class MyController {
	@Autowired
	private UserDaoImpl udao;
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/signup")
	public String signup() {
		return "signup";
	}

	@RequestMapping("/home")
	public String home1() {
		return "index";
	}

	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/two")
	public String two(User user, HttpServletResponse response, ModelMap model) {
		System.out.println(user);
		//store the user in db and redirect to login page
		udao.create(user);
		return "login";
	}

}
