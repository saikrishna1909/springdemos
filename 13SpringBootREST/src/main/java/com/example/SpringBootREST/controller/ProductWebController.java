package com.example.SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootREST.entity.Product;
import com.example.SpringBootREST.repository.ProductRepo;

@Controller
@RequestMapping("/product")
public class ProductWebController {
	@Autowired
	ProductRepo repo;
	
	public String getUsers(ModelMap model) {
		Iterable<Product> products=repo.findAll();
		model.addAttribute("products",products);
		return "products";
	}
}
