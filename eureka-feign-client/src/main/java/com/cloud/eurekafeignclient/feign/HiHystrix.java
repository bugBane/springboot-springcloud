package com.cloud.eurekafeignclient.feign;

import org.springframework.stereotype.Component;

// 实现feign接口,作为熔断器触发处理机制
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",hystrix: sorry error!";
    }
}
