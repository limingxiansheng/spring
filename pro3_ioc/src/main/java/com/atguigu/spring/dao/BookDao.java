package com.atguigu.spring.dao;

import com.atguigu.spring.pojo.User;

import java.awt.print.Book;

/**
 * @createTime : 2022/8/4 21:59
 */

public interface BookDao {


    Integer getBookPrice(Integer userId, Integer bookId);
}
