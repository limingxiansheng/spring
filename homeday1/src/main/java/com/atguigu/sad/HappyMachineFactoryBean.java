package com.atguigu.sad;

import com.atguigu.happy.HappyChine;
import com.atguigu.happy.HappyComponent;
import com.atguigu.happy.HappyComponentImpl1;
import org.springframework.beans.factory.FactoryBean;

/**
 * @createTime : 2022/8/1 20:44
 *
 * 这里实现了FactoryBean接口，返回的是public HappyChine getObject()里面的 getObject 方法的返回值
 */
/*
这里我们需要给定一个返回值 HappyChine
* */
public class HappyMachineFactoryBean implements FactoryBean<HappyChine> {
   //这里我们定义两个属性，后面直接new对象//成员变量默认值为null,所以我们这里加属性方法
   private String machineName;
   private String componentName;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    @Override
    public HappyChine getObject() throws Exception {
        //这里是以java的方式创建对象
        HappyChine happyChine = new HappyChine();
        happyChine.setName(machineName);
        //这里再创建个对象
        HappyComponent happyComponent = new HappyComponentImpl1();
        happyComponent.setCompontName(componentName);
        happyChine.setHappyComponent(happyComponent);
        return happyChine;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
