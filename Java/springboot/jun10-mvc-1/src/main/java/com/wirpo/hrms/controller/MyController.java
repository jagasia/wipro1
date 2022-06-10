package com.wirpo.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/employee")	all the methods in this controller, the /employee is common
public class MyController {
	
//	@GetMapping("/")
//	public String home(ModelMap model)
//	{
//		model.addAttribute("name", "Raja..");
//		return "index";		//it is automatically translated into /WEB-INF/views/index.jsp
//	}
	
	@GetMapping("/")
	public ModelAndView home()
	{		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", "Raja Sivakumar..");		//this is model
		mv.setViewName("index"); 			//this is view
//		return "index";		//it is automatically translated into /WEB-INF/views/index.jsp
		return mv;
	}
	
	@GetMapping("/add")
//	@ResponseBody
	public String add(@RequestParam("no1")Integer no1, @RequestParam("no2")Integer no2, ModelMap model)
	{
//		return "Adding"; 		//there should be "Adding.jsp" file But i am going to print "Adding" as a content
		
		int sum=no1+no2;
//		ModelMap model=new ModelMap();
		model.addAttribute("sum",sum);
		return "index";
	}
	
//	@GetMapping("/showLogin")
	@RequestMapping(method = RequestMethod.GET, value = "/showLogin")
	public String showLogin()
	{
		return "login";
	}
	
	@PostMapping("/validateLogin")	
	public String validateLogin(@RequestParam("username")String username, @RequestParam("password")String password, ModelMap model)
	{
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		return "index";
	}
}
