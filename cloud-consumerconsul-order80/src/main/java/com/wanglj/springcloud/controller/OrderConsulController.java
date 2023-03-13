package com.wanglj.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Wanglj
 * @date 2020/3/29 16:48
 */
@RestController
@Slf4j
public class OrderConsulController {

    private static  final  String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public  String paymentInfo(){

        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return  result;
    }
}
