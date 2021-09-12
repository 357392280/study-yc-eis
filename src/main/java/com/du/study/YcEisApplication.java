package com.du.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.du.study.entity.dto.*")
public class YcEisApplication {
    public static void main(String[] args) {
        SpringApplication.run(YcEisApplication.class,args);
    }
}
