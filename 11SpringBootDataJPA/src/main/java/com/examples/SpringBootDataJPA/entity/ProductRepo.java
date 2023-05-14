package com.examples.SpringBootDataJPA.entity;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer>{

}
