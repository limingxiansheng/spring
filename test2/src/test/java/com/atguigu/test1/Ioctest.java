package com.atguigu.test1;

import com.atguigu.springr.SpringIoc;
import com.atguigu.springr.SpringIocImpl2;
import com.atguigu.springr.SpringSet;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @createTime : 2022/8/1 12:52
 */
public class Ioctest {

    @Test
    public void test1(){
        //创建ioc
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:spring.xml");

        //获取Bean
        SpringIoc springIoc = factory.getBean("SpringIoc", SpringIoc.class);

        //调用方法
        springIoc.doWOrk();
    }

    @Test
    public void test3(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");

        //获取Bean
        //SpringIoc springIoc = factory.getBean("SpringIoc", SpringIoc.class);
        //用类名
        SpringIoc springIoc = factory.getBean(SpringIocImpl2.class);
        //用·接口名
       // SpringIoc springIoc = factory.getBean(SpringIoc.class);

        //调用方法
       springIoc.doWOrk();
    }

    @Test
    public void test2(){
        //创建ioc
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:spring.xml");

        //获取对象
        SpringSet springIoc = factory.getBean("SpringSet", SpringSet.class);

        //调用方法
        System.out.println(springIoc);
    }
}
