package com.ssm.demo.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 2019/11/24
 * author:ljh
 */
public class Student1 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("第五步：初始化前执行postProcessBeforeInitialization方法："+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("第八步：初始化后执行postProcessAfterInitialization方法："+s);
        return o;
    }
}
