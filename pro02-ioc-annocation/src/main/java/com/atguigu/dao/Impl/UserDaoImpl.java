package com.atguigu.dao.Impl;

import com.atguigu.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @createTime : 2022/8/2 11:02
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("UserDaoImpl   添加对象并保存成功");
    }
}
