package com.examples.SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("id",123);
		modelView.addObject("name","Sai");
		modelView.addObject("age",23);
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("id",id);
		mv.addObject("name",name);
		mv.setViewName("showdata");
		return mv;
	}
}
