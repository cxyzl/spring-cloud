package com.spring.cloud.controller;

import com.spring.cloud.entities.Payment;
import com.spring.cloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {
    private static final String PAYMENT_URL = "http://localhost:8001/payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult<Payment> add(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+ "/add",payment,CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        log.info("查询请求参数为：{}", id);
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/get/" + id, CommonResult.class);
        log.info(entity.getStatusCode() + "\t" + entity.getStatusCodeValue());
        return entity.getBody();
    }

    @GetMapping("/test")
    public String test() {
        return "hhhhhh";
    }
}
