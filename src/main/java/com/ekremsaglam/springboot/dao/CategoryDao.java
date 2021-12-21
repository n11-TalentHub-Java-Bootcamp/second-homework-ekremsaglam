package com.ekremsaglam.springboot.dao;

import com.ekremsaglam.springboot.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends CrudRepository<Category, Long> {

}