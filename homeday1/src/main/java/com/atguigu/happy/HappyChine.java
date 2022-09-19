package com.atguigu.happy;

/**
 * @createTime : 2022/8/1 18:54
 *
 * 级联赋值操作时要注意在接口中提供相应的setter方法
 */
public class HappyChine {

    private String name;

    private HappyComponent happyComponent;

    public HappyChine(String name, HappyComponent happyComponent) {
        this.name = name;
        this.happyComponent = happyComponent;
    }

    public HappyChine() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HappyComponent getHappyComponent() {
        return happyComponent;
    }

    public void setHappyComponent(HappyComponent happyComponent) {
        this.happyComponent = happyComponent;
    }

    @Override
    public String toString() {
        return "HappyChine{" +
                "name='" + name + '\'' +
                ", happyComponent=" + happyComponent +
                '}';
    }
}
