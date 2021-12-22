package com.demo3;

import org.springframework.context.annotation.*;

//根据指定的包路径扫描注解
@ComponentScan("com.demo3")//能够扫描当前包及其子包
//标识当前类是配置类，其实就是配置文件
@Configuration
public class SpringCatConfig {
    /**
     * 注解管理对象--自定义对象
     * 方法要求：
     * 1.必须为公有的
     * 2.必须添加返回值,返回值的对象,就是容器管理的对象
     * 3.方法的名称就是bean的Id
     * 4.方法必须使用@Bean的注解标识,spring才会执行该方法
     *   标识该对象交给Spring容器管理
     */
    @Bean
    @Scope("prototype")//表示多例对象(多例模式都是懒加载)
//    @Scope("singleton")//表示单例对象,默认,不写参数也是@Scope
    @Lazy               //开启懒加载
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Snake snake(){
        return new Snake();
    }
}
