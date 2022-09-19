package com.atguigu.testaop;

import com.atguigu.bean.Calculator;
import com.atguigu.bean.CalculatorLogImpl;
import com.atguigu.proxybean.ProxyFactory;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

/**
 * @createTime : 2022/8/3 18:56
 */

public class TestAop {


    @Test
    public void testDynamicProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorLogImpl());

        //这里使用的是向上转型
        Calculator proxy = (Calculator) proxyFactory.getProxy();

        //调方法
        proxy.add(22,33);

    }

}
