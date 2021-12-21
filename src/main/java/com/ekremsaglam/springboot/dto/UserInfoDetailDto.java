package com.ekremsaglam.springboot.dto;

import javax.persistence.Column;
import java.util.Date;

public class UserInfoDetailDto {
    private Long id;
    private String name;
    private String surName;
    private String email;
    private String phoneNumber;
    private String userName;

    public UserInfoDetailDto() {
    }

    public UserInfoDetailDto(Long id, String name, String surName, String email, String phoneNumber, String userName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
