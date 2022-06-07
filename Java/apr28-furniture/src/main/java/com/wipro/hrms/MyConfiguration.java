package com.wipro.hrms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class MyConfiguration {

	@Bean
	public BookShelf bs()
	{
		return new BookShelf();
	}
}
