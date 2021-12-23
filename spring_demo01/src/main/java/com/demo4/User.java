package com.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component//将user对象交给Spring容器管理
public class User {
    public User(){
        System.out.println("User无参构造");
    }
    /*注入:将spring容器中的对象进行引进用
              @Autowired:可以将容器中对象进行注入
                1.按照类型注入
                    如果注入的类型是接口,则自动查找其实现类对象进行注入
                    注意:一般spring框架的接口都是单实现,特殊情况可以实现多实现
                2.按照名称注入
         */
//    @Autowired
//    @Qualifier("dog")//spring的,按名称注入9
//    @Resource(name = "dog")//java自带的,按名称注入
    /*按类型:父接口时,多个实现类会报错,只能按名称*/
//    private Pet pet;

    /*按类型:具体类时,多个类型,只会注入第一个类型*/
//    private Cat cat;
//    private Dog dog;

    public void helloo(){
        System.out.println("User:hello");
//        pet.hello();
//        cat.hello();
//        dog.hello();
    }
    public void hii(){
//        pet.hi();
//        cat.hello();
//        dog.hi();
    }
    /*
//    不用实现接口的类也可以注入,并成功执行
    @Autowired
    Snake snake;
    public void world(){
        snake.hello();
    }
    */

}
