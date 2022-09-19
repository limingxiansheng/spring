package com.atguigu.service.Impl;

import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @createTime : 2022/8/2 11:00
 */
@Service
public class UserviceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void saveUser() {

        userDao.saveUser();

    }
}
