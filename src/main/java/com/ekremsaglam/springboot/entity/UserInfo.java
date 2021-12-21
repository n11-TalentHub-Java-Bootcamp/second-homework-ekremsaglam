package com.ekremsaglam.springboot.entity;

import javax.persistence.*;

/**
 * id
 * name
 * surname
 * email
 * phoneNumber
 */

@Entity
@Table(name = "USER_INFO")
public class UserInfo {

    public UserInfo() {
    }

    public UserInfo(Long id, String name, String surName, String email, String phoneNumber, String userName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PRODUCT_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 50, name = "NAME")
    private String name;

    @Column(length = 50, name = "SURNAME")
    private String surName;

    @Column(length = 50, name = "EMAIL")
    private String email;

    @Column(length = 15, name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(length = 20, name = "USERNAME")
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
