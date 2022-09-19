package com.atguigu.happy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @createTime : 2022/8/2 21:08
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-----------针对所有bean,初始化之前执行   postProcessBeforeInitialization-----------------");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-----------针对所有bean,初始化之后执行   postProcessAfterInitialization--------------");
        return null;
    }
}
