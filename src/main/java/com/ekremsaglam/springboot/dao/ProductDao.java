package com.ekremsaglam.springboot.dao;

import com.ekremsaglam.springboot.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product, Long> {

}