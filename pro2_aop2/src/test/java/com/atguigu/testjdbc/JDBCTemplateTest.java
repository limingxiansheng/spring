package com.atguigu.testjdbc;

import com.atguigu.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @createTime : 2022/8/3 16:04
 */
//在测试类装配jdbcTemplate
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:spring.xml")
public class JDBCTemplateTest {

        //自动装配
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void test2(){
  //测试增加功能
        String sql= "insert into user values(null,?,?,?)";
        int i = jdbcTemplate.update(sql, "一岁一库", 345, "123@qq.com");
        System.out.println(i);
    }

    @Test
    public void test3(){
        //测试查询功能  查询全部
        String sql= "select * from user ";
       List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));

      list.forEach(System.out::println);
    }

    @Test
    public void test4() {
        //测试查询功能  查询单个
        String sql = "select * from user where id=? ";

        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 50);
        System.out.println(user);
    }

    @Test
    public void test5() {
        //测试查询功能  查询单行单列的数据
        String sql = "select count(id) from user ";

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

}
