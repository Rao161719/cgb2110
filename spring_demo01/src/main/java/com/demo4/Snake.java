package com.demo4;

import org.springframework.stereotype.Component;

/*交给spring管理,并且不实现接口Pet*/
@Component
public class Snake {
    public void hello(){
        System.out.println("Snake~~~");
    }
}
