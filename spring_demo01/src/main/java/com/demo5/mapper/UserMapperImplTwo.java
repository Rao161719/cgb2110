package com.demo5.mapper;

import org.springframework.stereotype.Repository;

@Repository("mapperTwo")
public class UserMapperImplTwo implements UserMapper{
    public UserMapperImplTwo() {
        System.out.println("UserMapperImplTwo无参构造~");
    }

    @Override
    public void hello() {
        System.out.println("UserMapperImplTwo实现类");
    }
}
