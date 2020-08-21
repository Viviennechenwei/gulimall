package com.learning.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.learning.gulimall.product.dao")
@SpringBootApplication
public class GulimalProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimalProductApplication.class, args);
    }

}
