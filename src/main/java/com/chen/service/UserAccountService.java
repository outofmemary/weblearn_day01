package com.chen.service;

import com.chen.dao.mapper.UserAccountMapper;
import com.chen.entity.UserAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAccountService {
    @Resource
    private UserAccountMapper userAccountMapper;

    public UserAccount getUserAccount(){
        return userAccountMapper.getUserAccount();
    }
}
