package com.demo3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Snake {

    //1.无参构造方法
    public Snake(){
        System.out.println("蛇蛋诞生!!!");
    }
    //2.初始化方法
    @PostConstruct//构造方法之后
    public void init(){
        System.out.println("蛇破壳了,四处溜达");
    }
    //3.业务方法
    public void eat(){
        System.out.println("蛇四处觅食!!!");
    }
    //4.销毁方法
    @PreDestroy//销毁方法之前
    public void destroy(){
        System.out.println("打蛇打七寸,翘辫子!!!");
    }
}
