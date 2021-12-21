package com.ekremsaglam.springboot.dto;

import java.math.BigDecimal;

public class ProductDetailDto {

    private Long productId;
    private String productName;
    private String categoryName;
    private BigDecimal productPrice;
    private int commentCount;

    public ProductDetailDto() {
    }

    public ProductDetailDto(String productName, String categoryName, BigDecimal productPrice) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.productPrice = productPrice;
    }

    public ProductDetailDto(Long productId, String productName, BigDecimal productPrice, int commentCount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.commentCount = commentCount;
    }

    public ProductDetailDto(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductDetailDto{" +
                "productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
