package com.lfsenior.learn.springbeanaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBeanAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanAopApplication.class, args);
    }

}
