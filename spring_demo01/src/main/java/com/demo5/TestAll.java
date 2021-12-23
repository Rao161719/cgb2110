package com.demo5;

import com.demo5.controller.UserControllerOne;
import com.demo5.controller.UserControllerTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAll {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAll.class);
        UserControllerOne controllerOne = context.getBean(UserControllerOne.class);
        UserControllerTwo controllerTwo = context.getBean(UserControllerTwo.class);
        controllerOne.controllerOne();
        controllerTwo.controllerTwo();
    }
}
