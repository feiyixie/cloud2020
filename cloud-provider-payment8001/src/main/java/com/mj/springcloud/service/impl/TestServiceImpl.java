package com.mj.springcloud.service.impl;

import com.mj.springcloud.mapper.TestMapper;
import com.mj.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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
