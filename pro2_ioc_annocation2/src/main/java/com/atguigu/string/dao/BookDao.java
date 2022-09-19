package com.atguigu.string.dao;

/**
 * @createTime : 2022/8/4 12:22
 */
public interface BookDao {

   //根据图书Id查询图书价格
    Integer getBookPriceById(Integer bookId);
  //更新图书库存
    void updateStock(Integer bookId);
  //更新用户余额
    void updateBalance(Integer userId, Integer price);
}
