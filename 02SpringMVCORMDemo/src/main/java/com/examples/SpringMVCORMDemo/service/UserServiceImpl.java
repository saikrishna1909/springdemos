package com.examples.SpringMVCORMDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.SpringMVCORMDemo.dao.UserDao;
import com.examples.SpringMVCORMDemo.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	public int save(User user) {
		int result=userDao.create(user);
		return result;
	}

	@Override
	public List<User> findAll() {
		
		List<User> users=userDao.showAll();;
		return users;
	}

}
