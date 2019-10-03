package com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern;

import java.lang.reflect.Constructor;

/**
 * 2019/9/28
 * author:ljh
 */
public class StaticLazySingletonFactoryTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThreadStatic());
        Thread t2 = new Thread(new ExectorThreadStatic());

        t1.start();
        t2.start();
    }
}
