package com.atguigu.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
/*切面类*/
@Aspect //表示此面类
@Component //表示此可以被放入到IOC容器中
public class LogAspect {

    @Pointcut("execution(* com.atguigu.bean.*.*(..))")
    public void poinCut(){}


    //前置通知
   @Before("pointCut()")
    public void beforeMethos(JoinPoint joinPoint){
        //获取方法名
       String methodName = joinPoint.getSignature().getName();
       //获取参数
       String args = Arrays.toString(joinPoint.getArgs());
       System.out.println("【动态代理】 前置通知----> 方法名为：" + methodName + "参数为：" + args);
    }

    //后置通知
    @After("pointCut()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();

        System.out.println("【动态代理】 后置通知----> 方法名为：" + methodName );
    }

    //返回通知
    @AfterReturning(value = "pointCut()",returning = "result")
    public void retrunMethod(JoinPoint joinPoint,Object result){

        String methodName = joinPoint.getSignature().getName();

        System.out.println("【动态代理】 返回通知----> 方法名为：" + methodName + "结果为：" + result);
    }

    //异常通知
    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void throwMethod(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("【动态代理】 异常通知----> 方法名为：" + methodName + "异常为：" + ex);

    }

    //环绕通知
    @Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());


        Object result=null;
        //核心业务逻辑  目标/连接点方法执行
        try {
            System.out.println("【环绕通知】 前置通知----> 方法名为："  + "参数为：" );

            //核心业务逻辑  目标/连接点方法执行
            result =  joinPoint.proceed();

            System.out.println("【环绕通知】 返回通知----> 方法名为："  + "参数为：" );
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("【环绕通知】 异常通知----> 方法名为："  + "参数为：" );
        }finally {
            System.out.println("【环绕通知】 后置通知----> 方法名为："  + "参数为：" );
        }

        return result;
    }

}
