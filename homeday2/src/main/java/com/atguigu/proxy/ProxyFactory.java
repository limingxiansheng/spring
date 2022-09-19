package com.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @createTime : 2022/8/2 19:27
 * 动态代理
 *
newProxyInstance()：创建一个代理实例
  其中有三个参数：
  1、classLoader：加载动态生成的代理类的类加载器
 2、interfaces：目标对象实现的所有接口的class对象所组成的数组
3、invocationHandler：设置代理对象实现目标对象方法的过程，即代理类中如何重写接口中的抽象方法

 */
public class ProxyFactory<T> {
   //定义目标接口
   private T target;

   public void setTarget(T target){
    this.target = target;
   }

   public T getInstance(){
    //目标类的类加载器
    ClassLoader classLoader =  target.getClass().getClassLoader();
    //目标类实现的接口
    Class<?>[] interfaces = target.getClass().getInterfaces();
    //设置代理对象实现目标对象方法的过程，即代理类中如何重写接口中的抽象方法
    InvocationHandler invocationHandler = new InvocationHandler() {
     @Override
     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      /**
       * proxy：代理对象
       * method：代理对象需要实现的方法，即其中需要重写的方法
       * args：method所对应方法的参数
       */
      Object result = null;
      try {
       System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
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

    return (T)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
   }
}
