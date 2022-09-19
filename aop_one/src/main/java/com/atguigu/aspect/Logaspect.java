package com.atguigu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @createTime : 2022/8/3 9:57
 */
@Aspect
@Component
public class Logaspect {

    @Before("execution(* com.atguigu.aopone.CalculatorPureImpl.add(..))")
    public void beforeLog(){
        System.out.println("[日志]  xxx方法开始了，参数是 x ,y");
    }



}
