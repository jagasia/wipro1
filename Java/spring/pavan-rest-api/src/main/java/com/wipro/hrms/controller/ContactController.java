package com.wipro.hrms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.hrms.entity.Contact;

@RestController
@RequestMapping("/contact")
public class ContactController {
	private List<Contact> contactList=new ArrayList<>();
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome";
	}
	
	@PostMapping
	public Contact addContact(@RequestBody Contact contact)
	{
		contactList.add(contact);
		return contact;
	}
	
	@GetMapping
	public List<Contact> retrieveAllContacts()
	{
		return contactList;
	}
}
