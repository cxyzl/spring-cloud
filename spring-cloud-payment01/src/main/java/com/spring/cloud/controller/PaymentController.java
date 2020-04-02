package com.spring.cloud.controller;

import com.spring.cloud.entities.Payment;
import com.spring.cloud.service.IPaymentService;
import com.spring.cloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Resource
    private IPaymentService paymentService;

    @PostMapping(value = "/add")
    public CommonResult add(Payment payment) {
        int result = paymentService.add(payment);
        log.info("========插入结果" + result);
        if (result > 0) {
            return new CommonResult(200,"插入成功", result);
        } else {
            return new CommonResult(444,"插入失败", result);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200,"查询成功", payment);
        } else {
            return new CommonResult(444,"查询失败", payment);
        }
    }
}
