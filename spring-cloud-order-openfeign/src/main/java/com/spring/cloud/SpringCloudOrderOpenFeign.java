package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class SpringCloudOrderOpenFeign {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderOpenFeign.class, args);
    }
}
