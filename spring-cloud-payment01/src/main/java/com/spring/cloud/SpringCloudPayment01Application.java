package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudPayment01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPayment01Application.class, args);
    }

}
