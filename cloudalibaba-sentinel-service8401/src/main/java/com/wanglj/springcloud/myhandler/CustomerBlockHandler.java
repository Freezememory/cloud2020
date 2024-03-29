package com.wanglj.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wanglj.springcloud.entities.CommonResult;
import com.wanglj.springcloud.entities.Payment;

/**
 * @author Wanglj
 * @date 2020/4/2 21:14
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException", new Payment(2020L, "serial0003"));
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException", new Payment(2020L, "serial0003"));
    }
}
