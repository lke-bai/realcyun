package com.realc.safe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.realc.safe.mapper")
public class SafeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SafeApplication.class, args);
    }

}
