package com.example.SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootREST.entity.Product;
import com.example.SpringBootREST.repository.ProductRepo;





@RestController
@RequestMapping("api/products")
public class ProductAPIController {
	@Autowired
	private ProductRepo productRepo;
	@GetMapping
	public Iterable<Product> getUsers() {
		return productRepo.findAll();
	}
	@GetMapping("/{id}")
	public Product getUserById(@PathVariable("id") Integer Id) {
		return productRepo.findById(Id).get();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product){
		return productRepo.save(product);
	}
	@PutMapping
	public Product update(@RequestBody Product product){
		return productRepo.save(product);
	}
}
