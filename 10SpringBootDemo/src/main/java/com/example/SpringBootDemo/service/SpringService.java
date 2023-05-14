package com.example.SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringBootDemo.dao.SpringDao;

@Component
public class SpringService {
	@Autowired
	SpringDao springDao;
	public void create() {
		springDao.hello();
	}
}
