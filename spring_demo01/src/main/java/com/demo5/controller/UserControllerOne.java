package com.demo5.controller;

import com.demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("controllerOne")
public class UserControllerOne {
    public UserControllerOne(){
        System.out.println("UserControllerOne无参构造~");
    }
    @Autowired
    @Qualifier("serviceOne")
    UserService UserServiceImplOne;
    public void controllerOne(){
        UserServiceImplOne.serviceOne();
    }
}
