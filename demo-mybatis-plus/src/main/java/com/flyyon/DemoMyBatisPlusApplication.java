package com.flyyon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author: Zhuyf
 * @version: 2022/4/25
 **/
@MapperScan("com.flyyon.mapper")
@SpringBootApplication
public class DemoMyBatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoMyBatisPlusApplication.class, args);
    }

}
