package com.wanglj.springcloud.service.impl;

import com.wanglj.springcloud.dao.PaymentDao;
import com.wanglj.springcloud.entities.Payment;
import com.wanglj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wanglj
 * @date 2020/3/26 22:39
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int  create(Payment payment){
        return  paymentDao.create(payment);
    }

    @Override
    public  Payment getPaymentById(Long id){
        return  paymentDao.getPaymentById(id);
    }

}
