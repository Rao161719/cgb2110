package com.demo5.controller;

import com.demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("controllerTwo")
public class UserControllerTwo {
    public UserControllerTwo(){
        System.out.println("UserControllerTwo无参构造~");
    }
    @Autowired
    @Qualifier("serviceTwo")
    UserService UserServiceImplTwo;
    public void controllerTwo(){
        UserServiceImplTwo.serviceTwo();
    }
}
