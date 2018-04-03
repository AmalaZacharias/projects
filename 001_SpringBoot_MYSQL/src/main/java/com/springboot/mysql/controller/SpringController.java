package com.springboot.mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@RequestMapping("/get")
	public String welcome() {
		return "Welcome to free snack hub!";
	}

	@RequestMapping("/snacks")
	public String welcome1() {
		return "Welcome to free snack hub at CTS!";
	}
}
