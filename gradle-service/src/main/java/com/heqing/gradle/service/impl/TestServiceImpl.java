package com.heqing.gradle.service.impl;

import com.heqing.gradle.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "hello world!";
    }
}
