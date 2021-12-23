package com.demo5.service;

import com.demo5.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviceOne")
public class UserServiceImplOne implements UserService{
    public UserServiceImplOne(){
        System.out.println("UserServiceImplOne无参构造~");
    }
    @Autowired
    @Qualifier("mapperOne")
    UserMapper UserMapperImplOne;
    @Override
    public void serviceOne() {
        UserMapperImplOne.hello();
    }

    @Override
    public void serviceTwo() {

    }
}
