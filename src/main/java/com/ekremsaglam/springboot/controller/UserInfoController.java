package com.ekremsaglam.springboot.controller;

import com.ekremsaglam.springboot.dto.UserInfoDetailDto;
import com.ekremsaglam.springboot.entity.UserInfo;
import com.ekremsaglam.springboot.service.entityservice.UserInfoEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoEntityService userInfoEntityService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/users")
    public List<UserInfo> findAllProductList(){
        return userInfoEntityService.findAll();
    }

    @GetMapping("/users/{id}")
    public UserInfo findUserInfoById(@PathVariable Long id){
        return userInfoEntityService.findById(id);
    }


    @GetMapping("/users/dto/{id}")
    public UserInfoDetailDto findProductDtoById(@PathVariable Long id){

        UserInfo userInfo = userInfoEntityService.findById(id);

        UserInfoDetailDto userInfoDetailDto = convertUserInfoToUserInfoDetailDto(userInfo);

        return userInfoDetailDto;
    }
    private UserInfoDetailDto convertUserInfoToUserInfoDetailDto(UserInfo userInfo) {

        UserInfoDetailDto userInfoDetailDto = new UserInfoDetailDto();
        userInfoDetailDto.setName(userInfo.getName());
        userInfoDetailDto.setSurName(userInfo.getSurName());
        userInfoDetailDto.setUserName(userInfo.getSurName());
        return userInfoDetailDto;
    }

}
