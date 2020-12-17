package com.mj.springcloud.service.impl;

import com.mj.springcloud.dao.TestMapper;
import com.mj.springcloud.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    TestMapper testMapper;

    @Override
    public String test() {
        return testMapper.test();
    }
}
