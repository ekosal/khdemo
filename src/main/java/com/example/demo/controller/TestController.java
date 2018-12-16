package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.services.UserService;

@Controller
public class TestController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping("/")
	public String indix(ModelMap map)
	{
		System.out.println("hello");
		map.addAttribute("count", userService.loadingUserIdMax());
		return "login";
	}

}
