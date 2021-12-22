package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGetDog {
    //该类表示从spring容器中，动态获取Dog对象
    public static void main(String[] args) {
        //1.指定spring配置文件路径
        String resource = "spring.xml";
        //2.启动spring容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext(resource);
        //3.从容器中获取对象
        Dog dog = (Dog) context.getBean("dog");//方法一，不知道什么类型，需要转型
        Dog dog2 = context.getBean(Dog.class);//方法二，知道类型，不用强转

        System.out.println(dog);//输出地址
        System.out.println(dog2);

        //4.对象调用方法
        dog.hello();
        dog2.hello();

        //利用发射机制创建对象
        getDot();
    }

    private static void getDot() {
        try {
            Dog dog = (Dog) Class.forName("com.demo2.Dog").newInstance();
            dog.hello();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
