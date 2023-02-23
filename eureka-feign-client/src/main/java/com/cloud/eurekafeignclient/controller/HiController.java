package com.cloud.eurekafeignclient.controller;

import com.cloud.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "cloud") String name) {
        return hiService.hi(name);
    }
}
