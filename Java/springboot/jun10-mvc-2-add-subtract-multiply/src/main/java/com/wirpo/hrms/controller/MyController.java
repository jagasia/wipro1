package com.wirpo.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/calculate", params = "add")
	public String add(@RequestParam("no1") Integer no1, @RequestParam("no2") Integer no2, ModelMap model)
	{
		int result=no1+no2;
		model.addAttribute("no1",no1);
		model.addAttribute("no2",no2);
		model.addAttribute("result",result);
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/calculate", params = "subtract")
	public String subtract(@RequestParam("no1") Integer no1, @RequestParam("no2") Integer no2, ModelMap model)
	{
		int result=no1-no2;
		model.addAttribute("no1",no1);
		model.addAttribute("no2",no2);
		model.addAttribute("result",result);
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/calculate", params = "multiply")
	public String multiply(@RequestParam("no1") Integer no1, @RequestParam("no2") Integer no2, ModelMap model)
	{
		int result=no1*no2;
		model.addAttribute("no1",no1);
		model.addAttribute("no2",no2);
		model.addAttribute("result",result);
		return "index";
	}
}
