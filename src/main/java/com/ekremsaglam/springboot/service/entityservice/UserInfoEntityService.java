package com.ekremsaglam.springboot.service.entityservice;

import com.ekremsaglam.springboot.dao.UserInfoDao;
import com.ekremsaglam.springboot.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoEntityService {

    @Autowired
    private UserInfoDao userInfoDao;

    public List<UserInfo> findAll(){
        return (List<UserInfo>) userInfoDao.findAll();
    }

    public UserInfo findById(Long id){
        Optional<UserInfo> optionalUserInfo = userInfoDao.findById(id);

        UserInfo userInfo = null;
        if (optionalUserInfo.isPresent()){
            userInfo = optionalUserInfo.get();
        }

        return userInfo;
    }

    public UserInfo save(UserInfo userInfo){
        return userInfoDao.save(userInfo);
    }

    public void delete(UserInfo userInfo){
        userInfoDao.delete(userInfo);
    }

    public void deleteById(Long id){
        userInfoDao.deleteById(id);
    }

    public long count(){
        return userInfoDao.count();
    }
}