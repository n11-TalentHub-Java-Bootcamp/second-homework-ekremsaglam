package com.ekremsaglam.springboot.controller;

import com.ekremsaglam.springboot.dto.ProductDetailDto;
import com.ekremsaglam.springboot.entity.Category;
import com.ekremsaglam.springboot.entity.Product;
import com.ekremsaglam.springboot.service.entityservice.CategoryEntityService;
import com.ekremsaglam.springboot.service.entityservice.ProductEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductEntityService productEntityService;
    
    @Autowired
    private CategoryEntityService categoryEntityService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> findAllProductList(){
        return productEntityService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable Long id){
        return productEntityService.findById(id);
    }


    @GetMapping("/products/dto/{id}")
    public ProductDetailDto findProductDtoById(@PathVariable Long id){

        Product product = productEntityService.findById(id);

        ProductDetailDto productDetailDto = convertProductToProductDetailDto(product);

        return productDetailDto;
    }

    private ProductDetailDto convertProductToProductDetailDto(Product product) {
        Category category = categoryEntityService.findById(product.getCategory().getId());

        ProductDetailDto productDetailDto = new ProductDetailDto();
        productDetailDto.setProductName(product.getName());
        productDetailDto.setProductPrice(product.getPrice());
        productDetailDto.setCategoryName(category.getName());
        return productDetailDto;
    }
}
