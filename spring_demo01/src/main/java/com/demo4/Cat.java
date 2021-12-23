package com.demo4;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Pet{
    @Override
    public void hello() {
        System.out.println("Cat:hello~");
    }

    @Override
    public void hi() {
        System.out.println("Cat:hi~");
    }
}
