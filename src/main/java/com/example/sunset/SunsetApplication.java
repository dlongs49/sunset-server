package com.example.sunset;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.example.sunset.mapper")
public class SunsetApplication {
    public static void main(String[] args) {
        SpringApplication.run(SunsetApplication.class, args);
    }

}
