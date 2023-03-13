package com.wanglj.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Wanglj
 * @date 2020/3/29 17:09
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value =  "/payment/zk")
    public String paymentZk(){

        return  "springCloud with zookeeper:" + serverPort +"\t" + UUID.randomUUID().toString();
    }
}
