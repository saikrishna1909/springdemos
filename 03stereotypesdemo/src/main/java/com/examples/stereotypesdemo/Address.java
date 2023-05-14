package com.examples.stereotypesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Hyderabad")
	public String city;
	@Value("Telangana")
	public String state;
	@Value("500001")
	public String pincode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
