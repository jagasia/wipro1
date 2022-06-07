package com.wipro.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class May12EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(May12EurekaClient1Application.class, args);
	}

}
