package com.atguigu.happy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @createTime : 2022/8/1 18:33
 */
@Component(value = "happyComponent")
public class HappyComponentImpl1 implements HappyComponent{

    @Value("毛毛雨")
    private String compontName;

    public HappyComponentImpl1() {
    }

    public HappyComponentImpl1(String compontName) {
        this.compontName = compontName;
    }

    public String getCompontName() {
        return compontName;
    }

    public void setCompontName(String compontName) {
        System.out.println("setCompontName");
        this.compontName = compontName;
    }

    @Override
    public void doWork() {
        System.out.println("HappyComponentImpl1     在放第一只羊" );
    }

    @Override
    public String toString() {
        return "HappyComponentImpl1{" +
                "compontName='" + compontName + '\'' +
                '}';
    }
}
