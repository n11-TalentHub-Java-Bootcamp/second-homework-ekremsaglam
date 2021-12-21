package com.ekremsaglam.springboot.service.entityservice;

import com.ekremsaglam.springboot.dao.ProductCommentDao;
import com.ekremsaglam.springboot.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentDao productCommentDao;

    public List<ProductComment> findAll(){
        return (List<ProductComment>) productCommentDao.findAll();
    }

    public ProductComment findById(Long id){
        Optional<ProductComment> optionalProductComment = productCommentDao.findById(id);

        ProductComment productComment = null;
        if (optionalProductComment.isPresent()){
            productComment = optionalProductComment.get();
        }

        return productComment;
    }

    public ProductComment save(ProductComment productComment){
        return productCommentDao.save(productComment);
    }

    public void delete(ProductComment productComment){
        productCommentDao.delete(productComment);
    }

    public void deleteById(Long id){
        productCommentDao.deleteById(id);
    }

    public long count(){
        return productCommentDao.count();
    }
}