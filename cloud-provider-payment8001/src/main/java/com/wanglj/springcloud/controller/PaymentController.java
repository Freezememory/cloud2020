package com.wanglj.springcloud.controller;

import com.wanglj.springcloud.entities.CommonResult;
import com.wanglj.springcloud.entities.Payment;
import com.wanglj.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Wanglj
 * @date 2020/3/26 22:44
 */
@RestController
@Slf4j
public class PaymentController {

        @Resource
        private PaymentService paymentService;
        @Resource
        private DiscoveryClient discoveryClient;

        @Value("${server.port}")
        private  String serverPort;

        @PostMapping(value = "/payment/create")
        public CommonResult create(@RequestBody Payment payment){
            int result = paymentService.create(payment);
            log.info("********插入结果：" + result);

            if(result > 0){
                return  new CommonResult(200,"插入数据库成功,serverPort:"+serverPort,result);
            }else {
                return  new CommonResult(500,"插入数据库失败",null);
            }
        }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id ){
            Payment payment = paymentService.getPaymentById(id);
            log.info("********查询结果：" + payment);

            if(payment != null){
                return  new CommonResult(200,"查询成功,serverPort:"+serverPort,payment);
            }else {
                return  new CommonResult(500,"无对应记录，查询id："+ id,null);
            }
        }

        @GetMapping(value = "/payment/discovery")
        public Object discovery(){
            List<String> services = discoveryClient.getServices();
            for(String element : services){
                log.info("---------服务名称:"+element);
            }

            List<ServiceInstance>  instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
            for(ServiceInstance instance : instances){
                log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
            }
            return  this.discoveryClient;
        }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return serverPort;
    }



}
