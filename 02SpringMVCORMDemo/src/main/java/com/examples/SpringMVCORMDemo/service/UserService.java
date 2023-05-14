package com.examples.SpringMVCORMDemo.service;

import java.util.List;

import com.examples.SpringMVCORMDemo.entity.User;

public interface UserService {
	public int save(User user);
	public List<User> findAll();
}
