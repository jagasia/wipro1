package com.wirpo.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Jun15OauthGmail1Application {

	@GetMapping("/")
	public String home()
	{
		return "Welcome to home";
	}
	
	@GetMapping("/callback")
	public String callback()
	{
		return "You have logged in successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Jun15OauthGmail1Application.class, args);
	}

}
