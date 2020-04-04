package com.spring.cloud.controller;

import com.spring.cloud.entities.Payment;
import com.spring.cloud.service.PaymentOpenFeignClient;
import com.spring.cloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/openFeign")
public class OpenFeignController {
    @Autowired
    private PaymentOpenFeignClient paymentClient;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        return paymentClient.getPaymentById(id);
    }
}
