package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.pojo.User;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

/**
 * @createTime : 2022/8/4 21:56
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer userId, Integer bookId) {
        //查询价格

        Integer bookStore = bookDao.getBookPrice(userId, bookId);

        //更新库存


        //更新余额
    }
}
