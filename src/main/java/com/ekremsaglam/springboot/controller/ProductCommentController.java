package com.ekremsaglam.springboot.controller;

import com.ekremsaglam.springboot.dto.ProductCommentDetailDto;
import com.ekremsaglam.springboot.entity.Product;
import com.ekremsaglam.springboot.entity.ProductComment;
import com.ekremsaglam.springboot.service.entityservice.ProductEntityService;
import com.ekremsaglam.springboot.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCommentCommentController {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;
    
    @Autowired
    private ProductEntityService productEntityService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/productComments")
    public List<ProductComment> findAllProductCommentList(){
        return productCommentEntityService.findAll();
    }

    @GetMapping("/productComments/{id}")
    public ProductComment findProductCommentById(@PathVariable Long id){
        return productCommentEntityService.findById(id);
    }


    @GetMapping("/productComments/dto/{id}")
    public ProductCommentDetailDto findProductCommentDtoById(@PathVariable Long id){

        ProductComment productComment = productCommentEntityService.findById(id);

        ProductCommentDetailDto productCommentDetailDto = convertProductCommentToProductCommentDetailDto(productComment);

        return productCommentDetailDto;
    }

    private ProductCommentDetailDto convertProductCommentToProductCommentDetailDto(ProductComment productComment) {
        Product product = productEntityService.findById(productComment.getProduct().getId());

        ProductCommentDetailDto productCommentDetailDto = new ProductCommentDetailDto();
        productCommentDetailDto.setCommentText(productComment.getComment());
        productCommentDetailDto.setProductName(productComment.getProduct().getName());
        return productCommentDetailDto;
    }
}
