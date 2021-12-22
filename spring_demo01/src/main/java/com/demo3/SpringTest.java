package com.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        //利用注解启动spring容器
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringCatConfig.class);//这里有向上转型
        //根据类型获取对象
       /* Cat cat = context.getBean(Cat.class);
        cat.hello();*/

        Snake snake = context.getBean(Snake.class);
        snake.eat();
        AnnotationConfigApplicationContext context1 = (AnnotationConfigApplicationContext) context;
        //关闭容器
        context1.close();
        /*
        ApplicationContext接口中没有close()方法
        想要手动关闭需要向下转型为他的子类:AnnotationConfigApplicationContext
        或者在启动容器时就用该类型的引用,也有获取对象的相关方法
         */
    }
}
