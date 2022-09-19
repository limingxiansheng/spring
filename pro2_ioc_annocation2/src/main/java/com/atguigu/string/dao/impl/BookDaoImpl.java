package com.atguigu.string.dao.impl;

import com.atguigu.string.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @createTime : 2022/8/4 12:22
 */
@Repository
public class BookDaoImpl implements BookDao {

   @Autowired
   private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getBookPriceById(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        //Integer.class  这是我们查询出来的语句要转换的java中的类型   后面是要为占位符所附的值
       return jdbcTemplate.queryForObject(sql,Integer.class,bookId);
    }

    @Override
    public void updateStock(Integer bookId) {
    //这是要修改图书的操作
    String sql = "update t_book set stock = stock -1  where book_id = ?";

    jdbcTemplate.update(sql,bookId);

    }

    @Override
    public void updateBalance(Integer userId, Integer price) {
     //这是要更新用户余额
  String sql = "update t_user set balance=balance-? where user_id = ? ";
    jdbcTemplate.update(sql,price,userId);
    }

}
