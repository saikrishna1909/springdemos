package com.examples.SpringMVCORMDemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.SpringMVCORMDemo.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int create(User user) {
		Integer result=(Integer)hibernateTemplate.save(user);
		return result;
	}
	@Override
	public List<User> showAll() {
		List<User> users=hibernateTemplate.loadAll(User.class);
		return users;
	}
	
}
