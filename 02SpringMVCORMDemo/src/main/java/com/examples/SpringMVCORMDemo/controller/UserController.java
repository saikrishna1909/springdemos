package com.examples.SpringMVCORMDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.SpringMVCORMDemo.entity.User;
import com.examples.SpringMVCORMDemo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/regpage")
	public String showRegistrationPage() {
		return "regpage";
	}
	@RequestMapping("/reguser")
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		int result=userService.save(user);
		model.addAttribute("message","User Created Successfully"+result);
		model.addAttribute("users",userService.findAll());
		return "regpage";
	}
}
