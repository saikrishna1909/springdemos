package com.examples.SpringMVCORMDemo.dao;

import java.util.List;

import com.examples.SpringMVCORMDemo.entity.User;

public interface UserDao {
	public int create(User user);
	public List<User> showAll();
}
