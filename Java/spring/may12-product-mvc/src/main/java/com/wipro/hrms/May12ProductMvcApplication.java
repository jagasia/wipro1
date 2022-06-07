package com.wipro.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class May12ProductMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(May12ProductMvcApplication.class, args);
	}

}
