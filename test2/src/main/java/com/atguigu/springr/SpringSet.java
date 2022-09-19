package com.atguigu.springr;

/**
 * @createTime : 2022/8/1 12:57
 */
public class SpringSet {

    //普通定义
    private String sex;

    //引用类型
    private SpringIoc springIoc;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public SpringIoc getSpringIoc() {
        return springIoc;
    }

    public void setSpringIoc(SpringIoc springIoc) {
        this.springIoc = springIoc;
    }

    @Override
    public String toString() {
        return "SpringSet{" +
                "sex='" + sex + '\'' +
                ", springIoc=" + springIoc +
                '}';
    }
}
