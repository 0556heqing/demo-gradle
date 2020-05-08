package com.heqing.gradle;

import com.heqing.gradle.service.TestService;
import com.heqing.gradle.service.impl.TestServiceImpl;

public class Test {

    public static void main(String[] args) {
        TestService testService = new TestServiceImpl();
        System.out.println("-->"+testService.test());
    }
}
