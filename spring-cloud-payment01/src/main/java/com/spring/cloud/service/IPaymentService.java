package com.spring.cloud.service;

import com.spring.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface IPaymentService {
    int add(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
