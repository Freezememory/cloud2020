package com.wanglj.springcloud;

import com.wanglj.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @author Wanglj
 * @date 2020/3/27 22:24
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MyselfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {

        SpringApplication.run(OrderMain80.class,args);
    }
}
