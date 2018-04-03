package com.springboot.first.contoller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstContoller {

		@RequestMapping("/hello")
		public String sayHello() {
			return "Hello from Spring Boot! ";
			
			
		}
}
