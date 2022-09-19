package com.atguigu.Hello;

/**
 * @createTime : 2022/8/1 11:55
 */
public class SpringSet {
    //普通
    private String name;
    //引用
    private SpringFirst springFirst;



    public void setName(String name) {
        this.name = name;
    }



    public void setSpringFirst(SpringFirst springFirst) {
        this.springFirst = springFirst;
    }

    @Override
    public String toString() {
        return "SpringSet{" +
                "name='" + name + '\'' +
                ", springFirst=" + springFirst +
                '}';
    }
}
