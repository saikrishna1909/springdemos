package com.example.SpringBootDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.SpringBootDemo.service.SpringService;

@SpringBootTest
class ApplicationTests {
	@Autowired
	ApplicationContext context;
	@Test
	void contextLoads() {
		SpringService springservice=context.getBean(SpringService.class);
	}

}
