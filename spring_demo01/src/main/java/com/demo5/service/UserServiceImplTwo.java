package com.demo5.service;

import com.demo5.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviceTwo")
public class UserServiceImplTwo implements UserService{
    public UserServiceImplTwo(){
        System.out.println("UserServiceImplTwo无参构造~");
    }
    @Override
    public void serviceOne() {

    }

    @Autowired
    @Qualifier("mapperTwo")
    UserMapper UserMapperImplTwo;
    @Override
    public void serviceTwo() {
        UserMapperImplTwo.hello();
    }
}
