package com.yb.spring.springbatchinaction;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing // 배치기능 활성화
@SpringBootApplication
public class SpringbatchinactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbatchinactionApplication.class, args);
    }

}
