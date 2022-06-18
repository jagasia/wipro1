package com.wipro.hrms;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FoodServiceApplication {

	@Bean
	public MultipartConfigElement multipartConfigElement() {
	    MultipartConfigFactory factory = new MultipartConfigFactory();
	    factory.setMaxFileSize(DataSize.ofBytes(100000000L));
	    factory.setMaxRequestSize(DataSize.ofBytes(100000000L));
	    return factory.createMultipartConfig();
	}
	public static void main(String[] args) {
		SpringApplication.run(FoodServiceApplication.class, args);
	}

}
