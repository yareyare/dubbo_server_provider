package com.juxinli.service;

import org.springframework.stereotype.Service;

/**
 * Created by ivy on 2017/11/23.
 */

@Service("testRegistryServiceImpl")
public class TestRegistryServiceImpl implements TestRegistryService {


    @Override
    public String hello(String name) {
        return "hello " + name + " ! ";
    }
}
