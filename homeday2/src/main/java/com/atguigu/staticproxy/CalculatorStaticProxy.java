package com.atguigu.staticproxy;

import com.atguigu.bean.Calculator;

/**
 * @createTime : 2022/8/2 18:31
 * //创建静态代理实现类
 *
 * 静态代理最关键的两点
 *  * 1.实现和目标类一样的接口（具有了和目标类一样的功能）
 *  * 2.关联和目标类一样的接口（调用目标类的方法，并且可以注入任意一个实现了该接口的实现类）
 */
public class CalculatorStaticProxy implements Calculator {


    //将被代理的目标对象声明为成员变量
    private Calculator target;

    public void setCalculator(Calculator target){
        this.target = target;
    }

    //实现核心业务逻辑代码前的日志信息打印·
    public void logBefore(){
        //附加功能由代理类中的方法实现
        System.out.println("[日志] xxx 方法开始了，参数是 i 和 j" );
    }

    //实现核心业务逻辑代码后的日志信息打印·
    public void logAfter() {

        System.out.println("[日志] xxx 方法结束了，结果是：result: " );
    }


    @Override
    public int add(int i, int j) {
        logBefore();

        //通过目标对象类实现核心业务逻辑
        int result = target.add(i, j);

        logAfter();
        return result;
    }

    @Override
    public int sub(int i, int j) {
        logBefore();

        //通过目标对象类实现核心业务逻辑
        int result = target.sub(i, j);

        logAfter();
        return result;
    }

    @Override
    public int mul(int i, int j) {
        logBefore();

        //通过目标对象类实现核心业务逻辑
        int result = target.mul(i, j);

        logAfter();
        return result;
    }

    @Override
    public int div(int i, int j) {
        logBefore();

        //通过目标对象类实现核心业务逻辑
        int result = target.div(i, j);

        logAfter();
        return result;
    }
}
