package com.atguigu.spring.controller;

import com.atguigu.spring.pojo.User;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.awt.print.Book;

/**
 * @createTime : 2022/8/4 21:54
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    public void buyBook(Integer userId, Integer bookId){

        bookService.buyBook(userId,bookId);

    }
}
