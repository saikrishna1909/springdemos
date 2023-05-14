package com.examples.SpringHibernate.Dao;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.SpringHibernate.Entity.Product;
@Component("productdao")
public class ProductDaoImp implements ProductDao{
	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public int create(Product product) {
		Integer result =(Integer) hibernateTemplate.save(product);
		return result;
		
	}

}
