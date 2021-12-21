package com.ekremsaglam.springboot.dao;

import com.ekremsaglam.springboot.entity.ProductComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentDao extends CrudRepository<ProductComment, Long> {

}