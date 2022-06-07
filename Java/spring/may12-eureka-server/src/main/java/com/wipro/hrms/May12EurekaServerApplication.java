package com.wipro.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class May12EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(May12EurekaServerApplication.class, args);
	}

}
