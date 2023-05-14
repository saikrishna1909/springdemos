package com.examples.stereotypesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	@Value("1")
	public int id;
	@Value("Max")
	public String name;
	
	@Autowired
	public Address address;
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
