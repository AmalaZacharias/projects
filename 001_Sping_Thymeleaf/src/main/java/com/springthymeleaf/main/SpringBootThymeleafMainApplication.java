package com.springthymeleaf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.springthymeleaf.controller"})
public class SpringBootThymeleafMainApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootThymeleafMainApplication.class, args);
	}

}
