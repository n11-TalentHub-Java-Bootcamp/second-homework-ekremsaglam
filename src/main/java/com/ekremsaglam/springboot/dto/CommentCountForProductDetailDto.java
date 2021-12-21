package com.ekremsaglam.springboot.dto;

import java.math.BigDecimal;

public class CommentCountForProductDetailDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private Long commentCount;

    public CommentCountForProductDetailDto() {
    }

    public CommentCountForProductDetailDto(Long id, String name, BigDecimal price,Long commentCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.commentCount=commentCount;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}
