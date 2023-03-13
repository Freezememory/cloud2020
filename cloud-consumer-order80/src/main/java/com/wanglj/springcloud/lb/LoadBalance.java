package com.wanglj.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Wanglj
 * @date 2020/3/29 23:23
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
