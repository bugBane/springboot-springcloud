package com.cloud.eurekafeignclient.service;

import com.cloud.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String hi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
