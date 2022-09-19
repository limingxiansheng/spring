package com.atguigu.proxybean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InterfaceAddress;
import java.util.Arrays;

/**
 * @createTime : 2022/8/3 18:45
 */
public class ProxyFactory {

    //1.创建目标对象
    private Object target;

    //2.创建有参构造赋值
    public ProxyFactory(Object target){
        this.target = target;
    }

    //工厂类帮助我们生成动态代理类对应的代理对象
    public Object getProxy(){
        ClassLoader loader = target.getClass().getClassLoader();

        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * proxy：代理对象
                 * method：代理对象需要实现的方法，即其中需要重写的方法，要执行的方法
                 * args：method所对应要执行方法的参数列表
                 */
                Object result = null;
                try {
                    System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                    //设置的是代理类的方法的重写，调目标对象和参数列表
                    result = method.invoke(target, args);
                    System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[动态代理][日志] "+method.getName()+"，异常："+e.getMessage());
                } finally {
                    System.out.println("[动态代理][日志] "+method.getName()+"，方法执行完毕");
                }
                return result;
            }
        };

        return Proxy.newProxyInstance(loader,interfaces,invocationHandler);
    }
}
