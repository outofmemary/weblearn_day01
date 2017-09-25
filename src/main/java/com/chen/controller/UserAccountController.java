package com.chen.controller;

import com.chen.entity.UserAccount;
import com.chen.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/userAccount")
public class UserAccountController {

    @Resource
    private UserAccountService userAccountService;


    @RequestMapping("/getUserAccount")
    @ResponseBody
    public UserAccount getUserAccount() {
        return userAccountService.getUserAccount();
    }
}
