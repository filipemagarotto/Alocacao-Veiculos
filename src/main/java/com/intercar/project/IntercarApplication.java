package com.intercar.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.intercar.controller")
public class IntercarApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntercarApplication.class, args);
	}

}
