package com.atguigu.happytest;

import com.atguigu.happy.HappyChine;
import com.atguigu.happy.HappyComponent;
import com.atguigu.happy.HappyComponentImpl1;
import com.atguigu.sad.PropValue;
import com.atguigu.sad.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @createTime : 2022/8/1 18:35
 */
public class HappyTest {
    @Test
    public void test1(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyComponent happyComponent = (HappyComponent) factory.getBean("happyComponent");
        //使用Bean
        happyComponent.doWork();
    }

    @Test
    public void test2(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyComponent happyComponent = (HappyComponent) factory.getBean("happyComponentImpl1");
        //使用Bean
        happyComponent.doWork();
    }

    @Test
    public void test3(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean  方式一：使用id
       // HappyComponentImpl1 happyComponent = factory.getBean("happyComponent", HappyComponentImpl1.class);

        //获取bean  方式二;使用类名，要求同一个类的bean只能使用一次
       // HappyComponentImpl1 happyComponent = factory.getBean(HappyComponentImpl1.class);

        //获取bean  方式二;使用接口名，要求同一个类的接口名只能使用一次
        HappyComponent happyComponent = factory.getBean(HappyComponent.class);
        //使用Bean
        happyComponent.doWork();
    }


    //给bean的属性赋值之setter注入
    @Test
    public void test4(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
       //获取bean
        HappyChine bean = factory.getBean(HappyChine.class);
        //使用bean
        System.out.println(bean);
    }

    //给bean的属性赋值之setter注入  引入外部已声明的bean
    @Test
    public void test5(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyChine happyChine = factory.getBean("happyChine1", HappyChine.class);
        //使用bean
        System.out.println(happyChine.toString());
    }

    //给bean的属性赋值之setter注入  内部声明的bean
    @Test
    public void test6(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyChine happyChine = factory.getBean("happyChine2", HappyChine.class);
        //使用bean
        System.out.println(happyChine.toString());
    }

    //给bean的属性赋值  引入2外部属性文件
    @Test
    public void test7() throws SQLException {
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        DataSource bean = factory.getBean(DataSource.class);
        //使用bean
        System.out.println(bean);
        //获取连接
        Connection connection = bean.getConnection();
        //输出连接
        System.out.println("连接：" + connection);
        //关闭资源
        connection.close();
    }

    //给bean的属性赋值:  级联属性赋值
    @Test
    public void test8(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyChine happyChine = factory.getBean("happyChine3", HappyChine.class);
        //使用bean
        System.out.println(happyChine);
    }


    //给bean的属性赋值:  构造器注入
    @Test
    public void test9(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean
        HappyChine happyChine = factory.getBean("happyChine4", HappyChine.class);
        //使用bean
        System.out.println(happyChine);
    }

    //给bean的属性赋值: 特殊值赋值
    @Test
    public void test10(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        //获取bean
        PropValue propValue = factory.getBean("propValue", PropValue.class);
        //使用bean
        System.out.println(propValue);
    }


//给bean的属性赋值:  使用p名称空间
    @Test
    public void test11(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        //获取bean
        HappyComponentImpl1 propValue = factory.getBean("happyComponentImpl2", HappyComponentImpl1.class);
        //使用bean
        System.out.println(propValue);
    }

    //给bean的属性赋值  集合属性
    @Test
    public void test12(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        //获取bean
        Student student = factory.getBean("student", Student.class);
        //使用bean
        System.out.println(student);
    }

//给bean的属性赋值  集合属性
    @Test
    public void test13(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        //从IOC容器中获取bean
        List<HappyComponent> componentList = (List<HappyComponent>) factory.getBean("componentList");
        //使用bean
       componentList.forEach(System.out::println);
    }

//FactoryBean机制
@Test
public void test14(){
    //创建ioc
    ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring2.xml");
    //从IOC容器中获取bean
    HappyChine happyMachine4 = factory.getBean("happyMachine4", HappyChine.class);
    //使用
    System.out.println(happyMachine4);
    //HappyChine{name='比亚迪', happyComponent=HappyComponentImpl1{compontName='梅赛德斯'}}
}



    @Test
    public void test15(){
        //创建ioc
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        //从IOC容器中获取bean
        HappyComponent happyComponent1 = factory.getBean("happyComponent6", HappyComponent.class);
        HappyComponent happyComponent2 = factory.getBean("happyComponent6", HappyComponent.class);
        //使用
        System.out.println(happyComponent1 == happyComponent2);//这里测试是否同一个对象
        System.out.println(happyComponent1.equals(happyComponent2));//内容相同，可能是不同的对象

        //多例下：FALSE FALSE
        //单例： true true

    }
}
