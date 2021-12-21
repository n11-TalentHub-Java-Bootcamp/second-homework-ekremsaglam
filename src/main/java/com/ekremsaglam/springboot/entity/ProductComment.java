package com.ekremsaglam.springboot.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * id
 * comment
 * commentDate
 * productId
 * userId
 */
@Entity
@Table(
        name = "PRODUCT_COMMENT"
)
public class ProductComment {

    public ProductComment() {
    }

    public ProductComment(Long id, String comment, Date commentDate, Product product, UserInfo userInfo) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.product = product;
        this.userInfo = userInfo;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PRODUCT_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 500, name = "COMMENT")
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID",
            foreignKey = @ForeignKey(name = "FK_COMMENT_PRODUCT_ID")
    )
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID",
            foreignKey = @ForeignKey(name = "FK_COMMENT_USER_ID")
    )
    private UserInfo userInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "ProductComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                ", product=" + product +
                ", userInfo=" + userInfo +
                '}';
    }
}