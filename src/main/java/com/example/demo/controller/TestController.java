package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
	
	@GetMapping("/")
	public String indix()
	{
		return "index";
	}

}
