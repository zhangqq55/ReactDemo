package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //直接声明一个接口，无须配置——————springBoot自动装配原理，实质是springBootApplication封装了spring中自动装配的注解
    @RequestMapping("/hello")//等价于一个接口http://localhost:8080/hello
    public String hello(){
        //调用业务，接收前端的参数
        return "hello,World";
    }
}
