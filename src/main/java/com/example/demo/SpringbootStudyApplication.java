package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //开启组件扫描和自动配置，等同于Spring中的@Configuration与@ComponentScan与@EnableAutoConfigration合体
@RestController
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);//负责启动引导应用程序
    }

    @RequestMapping("/hello")
    public String Hello(){

        return "hello,spring boot";

    }

}
