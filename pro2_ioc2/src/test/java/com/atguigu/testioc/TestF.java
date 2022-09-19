package com.atguigu.testioc;

import com.atguigu.happy.HappyComponent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @createTime : 2022/8/2 21:18
 */
public class TestF {
    @Test
    public void tesre1(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyComponent happyComponent = factory.getBean("happyComponent2", HappyComponent.class);
        //使用bean
        System.out.println(happyComponent);
    }
}
