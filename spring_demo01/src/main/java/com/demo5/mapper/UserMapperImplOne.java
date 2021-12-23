package com.demo5.mapper;

import org.springframework.stereotype.Repository;

@Repository("mapperOne")
public class UserMapperImplOne implements UserMapper{
    public UserMapperImplOne() {
        System.out.println("UserMapperImplOne无参构造~");
    }

    @Override
    public void hello() {
        System.out.println("UserMapperImplOne实现类");
    }
}
