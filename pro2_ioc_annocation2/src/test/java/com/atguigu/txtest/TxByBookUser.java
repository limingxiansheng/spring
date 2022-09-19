package com.atguigu.txtest;

import com.atguigu.string.collecter.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @createTime : 2022/8/4 14:46
 *
 * 声明式事物的配置步骤：
 *  1.在·spring的配置文件中·配置事物信息
 *  2.开启事物的注解驱动
 *  在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
 *  注解放到类上就表示可以类中所有的方法都会被事务管理
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx_annotation.xml")
public class TxByBookUser {

    @Autowired
    private BookController bookController;

    @Test
    public void test1(){

        bookController.buyBook(1,1);
    }


}
