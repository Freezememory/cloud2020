package com.wanglj.springcloud.dao;

import com.wanglj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wanglj
 * @date 2020/3/26 22:27
 */
@Mapper
public interface PaymentDao {

        public  int create(Payment payment);

        public  Payment getPaymentById(@Param("id") Long id);


}
