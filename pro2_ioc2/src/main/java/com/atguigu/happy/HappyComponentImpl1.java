package com.atguigu.happy;

import org.springframework.beans.factory.InitializingBean;

import java.util.Objects;

/**
 * @createTime : 2022/8/1 18:33
 */

public class HappyComponentImpl1 implements HappyComponent, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====InitializingBean================afterPropertiesSet=================");
    }

    private String compontName;

    public HappyComponentImpl1() {
        System.out.println("============实例化   HappyComponentImpl1 ==============");
    }

    public HappyComponentImpl1(String compontName) {

        this.compontName = compontName;
    }
    public void setCompontName(String compontName) {
        System.out.println("============属性注入   HappyComponentImpl1 ==============");
        this.compontName = compontName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappyComponentImpl1 that = (HappyComponentImpl1) o;
        return Objects.equals(compontName, that.compontName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compontName);
    }


    @Override
    public void doWork() {
        System.out.println("HappyComponentImpl1     doWork" );
    }

    @Override
    public String toString() {
        return "HappyComponentImpl1{" +
                "compontName='" + compontName + '\'' +
                '}';
    }

 public void init123(){
     System.out.println("初始化  init123");
 }

 public void destory321(){
     System.out.println("==========销毁   destory321=============");
 }
}
