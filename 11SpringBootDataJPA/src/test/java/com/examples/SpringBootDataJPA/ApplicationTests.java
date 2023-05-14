package com.examples.SpringBootDataJPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.examples.SpringBootDataJPA.entity.Product;
import com.examples.SpringBootDataJPA.entity.ProductRepo;


@SpringBootTest
class ApplicationTests {
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}
	@Test
	public void createProduct() {
		Product product=new Product();
		product.setName("Chicken");
		product.setDesc("Eat Chicken Sleep well");
		product.setPrice(200.00);
		ProductRepo productRepo=context.getBean(ProductRepo.class);
		productRepo.save(product);
		
	}
}
