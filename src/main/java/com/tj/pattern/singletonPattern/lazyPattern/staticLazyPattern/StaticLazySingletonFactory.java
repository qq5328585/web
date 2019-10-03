package com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern;

import com.tj.Test;
import com.tj.User;

/**
 * 2019/9/28
 * author:ljh
 */
public class StaticLazySingletonFactory {
    private StaticLazySingletonFactory() {
        //防止反射实例化
        if(InitStatic.staticLazySingletonFactory != null) {
            throw new RuntimeException("不允许实例化");
        }
    }

    public static final StaticLazySingletonFactory getInstance() {
        return InitStatic.staticLazySingletonFactory;
    }

    //通过静态内部类实例化对象,只有被调用getInstance才会实例化,减少创建浪费空间
    private static class InitStatic {
        StaticLazySingletonFactory a = getInstance();
        private static final StaticLazySingletonFactory staticLazySingletonFactory = new StaticLazySingletonFactory();
    }
}
