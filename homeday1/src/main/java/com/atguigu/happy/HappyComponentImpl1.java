package com.atguigu.happy;

/**
 * @createTime : 2022/8/1 18:33
 */
public class HappyComponentImpl1 implements HappyComponent{

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
