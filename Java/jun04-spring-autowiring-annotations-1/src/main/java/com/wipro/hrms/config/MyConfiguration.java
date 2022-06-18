package com.wipro.hrms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.hrms.model.VideoPlayer;

@Configuration
@ComponentScan(basePackages = {"com","com.wipro"})
public class MyConfiguration {

	@Bean
	public VideoPlayer video()
	{
		return new VideoPlayer();
	}
}
