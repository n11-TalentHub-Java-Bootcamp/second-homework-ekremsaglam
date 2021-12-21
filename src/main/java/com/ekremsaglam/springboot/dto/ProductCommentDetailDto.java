package com.ekremsaglam.springboot.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDetailDto {
    private String productName;
    private String categoryName;
    private BigDecimal productPrice;
    private String name;
    private String surName;
    private String email;
    private String phoneNumber;
    private String commentText;
    private Date commentDate;

    public ProductCommentDetailDto() {
    }

    public ProductCommentDetailDto(String productName, String categoryName, BigDecimal productPrice,
                                   String name, String surName, String email, String phoneNumber,
                                   String commentText, Date commentDate)
    {
        this.productName = productName;
        this.categoryName = categoryName;
        this.productPrice = productPrice;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.commentText = commentText;
        this.commentDate = commentDate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }








}
