package com.springboot.mysql.controller;

import org.springboot.mysql.repository.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mysql.entity.UseWater;

@RestController
@RequestMapping("/water")
public class WaterController {
	
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Free water at CTS";
	}
	
	@RequestMapping("/welcome/free")
	public String welcomefree() {
		return "You win 1 ltr of free petrol";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addWater(@RequestBody UseWater usewater) {
		waterRepository.save(usewater);
		
	}
	
	
}
