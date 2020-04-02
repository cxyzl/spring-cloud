package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrder80Application.class, args);
    }

}
