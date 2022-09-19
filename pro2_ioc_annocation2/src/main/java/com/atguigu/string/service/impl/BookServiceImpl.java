package com.atguigu.string.service.impl;

import com.atguigu.string.dao.BookDao;
import com.atguigu.string.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @createTime : 2022/8/4 12:20
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    @Transactional(

            //readOnly = true  只读操作，这里我们只能做查询使用，默认为false
            //timeout = -1  可以通过这个属性设置超时时间，单位为秒，让事物方法执行过程只能够休眠几秒 ，
            // 报异常就是在规定的时间内没有执行完则会抛出异常并且强制回滚

            //noRollbackFor = ArithmeticException.class //回滚策略，表示在啥条件下不会回滚，
            // 这个例子就是在数学运算异常下不选择回滚,这里也能写异常对应的全类名的字符串
            //默认所有的运行时异常都会造成回滚
            isolation = Isolation.DEFAULT //默认的隔离级别   是枚举类

            // propagation  //是设置事物的传播行为的
    )

    public void buyBook(Integer userId,Integer bookId) {

            //查询图书价格
            Integer price =  bookDao.getBookPriceById(bookId);

            //更新图书库存  这里只考虑一次购买一本的情况
            bookDao.updateStock(bookId);

            //更新图书信息
            bookDao.updateBalance(userId,price);


        }
    }

