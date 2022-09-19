package com.atguigu.test;

import com.atguigu.hellospring.HelloSpring;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @createTime : 2022/8/1 10:56
 */
public class TestIOC{
    @Test
    public  void test1(){
        //创建IoC容器
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 从IoC容器中获取Bean
        HelloSpring helloSpring =(HelloSpring) factory.getBean("HelloSpring");
        // 使用Bean
        helloSpring.doSpring();
    }
}
