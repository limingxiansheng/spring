package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.pojo.User;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

/**
 * @createTime : 2022/8/4 22:00
 */

@Repository
public class BookDaoImpl implements BookDao {


    @Override
    public Integer getBookPrice(Integer userId, Integer bookId) {
        return null;
    }
}
