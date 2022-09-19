package com.atguigu.string.collecter;

import com.atguigu.string.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @createTime : 2022/8/4 12:28
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //模拟买书得功能
    public  void  buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }

}
