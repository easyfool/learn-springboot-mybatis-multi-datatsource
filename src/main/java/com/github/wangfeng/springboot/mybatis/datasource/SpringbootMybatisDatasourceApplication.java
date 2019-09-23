package com.github.wangfeng.springboot.mybatis.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.wangfeng.springboot.mybatis.datasource.mapper")
public class SpringbootMybatisDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDatasourceApplication.class, args);
    }

}

