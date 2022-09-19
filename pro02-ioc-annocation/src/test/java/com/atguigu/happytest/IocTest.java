package com.atguigu.happytest;

import com.atguigu.collerter.UserCollecter;
import com.atguigu.happy.HappyComponent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @createTime : 2022/8/2 9:48
 */
public class IocTest {
@Test
    public void test1(){
    //创建ioc
    ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
    //获取bean
    HappyComponent happyComponent = factory.getBean("happyComponent", HappyComponent.class);
    //使用bean
    System.out.println(happyComponent);
}

   //测试分层操作保存方法
    @Test
    public void test2(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        UserCollecter userCollecter = factory.getBean("userCollecter", UserCollecter.class);
        //使用bean
        userCollecter.saveUser();
    }
}
