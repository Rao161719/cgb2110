package com.demo4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//标识为配置类
@ComponentScan("com.demo4")//扫描指定包中的被标记的类,放到容器中管理
public class SpringConfig {
/*@Configuration:
*   会扫描该类下面的@Bean标记方法,用来创建对象
* @ComponentScan:
*   用来扫描指定包下的所有被标记(@Component,@Service...)的类,并为其创建对象*/
}
