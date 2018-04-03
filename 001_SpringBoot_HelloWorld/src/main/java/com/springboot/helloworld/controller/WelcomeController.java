package com.springboot.helloworld.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = {"com.sprngboot.helloworld.controller"})
public class WelcomeController {

	@RequestMapping("/get/snacks")
	public String welcome() {
		return "Go and have a cake party!!!";
	}
}
