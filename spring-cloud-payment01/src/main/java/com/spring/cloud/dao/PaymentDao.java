package com.spring.cloud.dao;

import com.spring.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//dao推荐使用这个注解，不要用repository
@Mapper
public interface PaymentDao {
    int add(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
