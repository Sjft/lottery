package com.sjft.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author sift
 * @date 2022-02-24 00:44
 */
@Configuration
@EnableDubbo
@SpringBootApplication
@MapperScan(basePackages = "com.sjft.lottery.dao")
public class LotteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class, args);
    }
}
