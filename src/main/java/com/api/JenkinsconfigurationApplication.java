package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsconfigurationApplication.class, args);
	}

	
	
	@GetMapping
	public String user()
	{
		return null;
	
	}
	
	
}
