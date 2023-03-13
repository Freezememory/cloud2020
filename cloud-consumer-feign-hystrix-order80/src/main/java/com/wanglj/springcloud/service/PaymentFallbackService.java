package com.wanglj.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Wanglj
 * @date 2020/3/30 21:36
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public  String paymentInfo_OK(Integer id ){
        return  "-------PaymentFallbackService fall back-paymentInfo_OK,";
    }

    @Override
    public  String paymentInfo_TimeOut(Integer id ){
        return  "-------PaymentFallbackService fall back-paymentInfo_TimeOut";
    }


}
