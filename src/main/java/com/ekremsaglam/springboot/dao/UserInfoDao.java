package com.ekremsaglam.springboot.dao;

import com.ekremsaglam.springboot.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao extends CrudRepository<UserInfo, Long> {

}