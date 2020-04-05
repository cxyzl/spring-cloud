package com.spring.cloud.fallback;

import com.spring.cloud.service.PaymentOpenFeignClient;
import com.spring.cloud.vo.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class HystrixFallback implements PaymentOpenFeignClient {
    @Override
    public CommonResult getPaymentById(Long id) {
        return new CommonResult(444, "服务暂时不可用，请稍后再重试");
    }
}
