package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.services.UserService;

@Controller
public class TestController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping("/")
	public String indix()
	{
		System.out.println("hello");
		//System.out.println("max id == " + userService.loadingUserIdMax());
		return "login";
	}

}
