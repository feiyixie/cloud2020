package com.mj.springcloud.controller;

import com.mj.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org .springframework.web.bind.annotation.RestController;

@RestController
public class HeartTestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public String test(){
        return testService.test();
    }
}
