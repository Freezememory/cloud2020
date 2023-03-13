package com.wanglj.springcloud.service;

import com.wanglj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wanglj
 * @date 2020/3/26 22:38
 */
public interface PaymentService {

            public  int create(Payment payment);

            public  Payment getPaymentById(@Param("id") Long id);

}
