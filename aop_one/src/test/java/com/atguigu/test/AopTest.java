package com.atguigu.test;

import com.atguigu.aopone.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @createTime : 2022/8/2 20:19
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class AopTest {

    @Autowired
    Calculator calculator;

    @Test
    public void  test1(){
        int result = this.calculator.mul(23, 45);
        System.out.println(result);

        System.out.println("=============================================");

         result = this.calculator.add(23, 45);
        System.out.println(result);
    }
}
