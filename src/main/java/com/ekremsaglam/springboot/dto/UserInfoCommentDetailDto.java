package com.ekremsaglam.springboot.dto;

import java.util.Date;

public class UserInfoCommentDetailDto {
    private Long id;
    private String name;
    private String productName;
    private String commentText;
    private Date commentDate;

    public UserInfoCommentDetailDto() {
    }

    public UserInfoCommentDetailDto(Long id, String name, String productName, String commentText, Date commentDate) {
        this.id = id;
        this.name = name;
        this.productName = productName;
        this.commentText = commentText;
        this.commentDate = commentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
