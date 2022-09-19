package com.atguigu.test;

import com.atguigu.bean.Calculator;
import com.atguigu.bean.CalculatorLogImpl;
import com.atguigu.proxy.ProxyFactory;
import com.atguigu.staticproxy.CalculatorStaticProxy;
import org.junit.Test;

/**
 * @createTime : 2022/8/2 18:24
 */
public class TestAop {
    @Test
    public void test1() {
        //未使用静态及动态代理时的测试
        //这里能明显看出代码冗余切耦合度过高，所以后续我们会使用到静态代理喝动态代理
        Calculator calculatorLog = new CalculatorLogImpl();
        calculatorLog.add(23, 34);
    }

    @Test
    public void test2() {
        /*
        * 这里我们可以看到这里没有修改计算机类，就可以实现日志功能，符合开闭原则
        *  缺点是： 只能实现一个接口的实现类，不能代理其他接口的实现类
        *          静态代理类还需要额我们自己去创建
        * */
        //这里用静态代理操作
        //1.创建目标对象
        Calculator calculatorLog = new CalculatorLogImpl();
        //2.创建静态代理类的对象
        CalculatorStaticProxy proxy = new CalculatorStaticProxy();
        //3.设置关联
        proxy.setCalculator(calculatorLog);
        //4.测试方法
        int result = proxy.mul(23, 45);
        System.out.println(result);

        result = proxy.add(23, 45);
        System.out.println(result);
        /*[日志] xxx 方法开始了，参数是 i 和 j
          [日志] mul 方法开始了，参数是：23,45
           方法内部 result = 1035
          [日志] mul 方法结束了，结果是：1035
          [日志] xxx 方法结束了，结果是：result:
          1035
          [日志] xxx 方法开始了，参数是 i 和 j
          [日志] add 方法开始了，参数是：23,45
           方法内部 result = 68
           [日志] add 方法结束了，结果是：68
           [日志] xxx 方法结束了，结果是：result:
           68*/
    }
    @Test
    public void test3() {
    //这是测试动态代理类的测试类
        //创建Calulator的动态代理对象
        Calculator calculator = new CalculatorLogImpl();//目标类

        ProxyFactory<Calculator> proxyFactory = new ProxyFactory<>();//工厂对象，不是代理类

        proxyFactory.setTarget(calculator);

        Calculator instance = proxyFactory.getInstance();//获取到实例对象，代理

        int result = instance.add(23, 45);//通过代理对象来调用方法

        System.out.println(result);
    }
}
