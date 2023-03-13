package com.wanglj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wanglj
 * @date 2020/3/29 16:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain80.class,args);
    }
}
