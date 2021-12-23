package com.demo4;

import org.springframework.stereotype.Component;

@Component("dog")//将该类交给spring容器管理 key:dog, value:反射机制创建对象
public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog无参构造");
    }
    @Override
    public void hello() {
        System.out.println("圣诞节快到了!!!");
    }

    @Override
    public void hi() {
        System.out.println("hi~~~");
    }
}
