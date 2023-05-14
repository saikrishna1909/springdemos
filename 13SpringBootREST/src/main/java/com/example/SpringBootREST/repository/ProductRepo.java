package com.example.SpringBootREST.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootREST.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{

}
