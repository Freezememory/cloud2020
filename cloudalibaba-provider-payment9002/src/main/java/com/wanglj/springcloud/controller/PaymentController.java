package com.wanglj.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wanglj
 * @date 2020/4/1 21:44
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value =  "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id ){
        return  "nacos registry, serverPort: " + serverPort + "\t id" + id;
    }
}
