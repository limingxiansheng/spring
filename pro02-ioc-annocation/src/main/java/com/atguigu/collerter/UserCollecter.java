package com.atguigu.collerter;

import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @createTime : 2022/8/2 10:55
 */
@Controller
public class UserCollecter {
 @Autowired
    private UserService userService;

    public void saveUser(){

        userService.saveUser();
    }
}
