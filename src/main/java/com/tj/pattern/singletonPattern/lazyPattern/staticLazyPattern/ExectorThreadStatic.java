package com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern;

/**
 * 2019/9/28
 * author:ljh
 */
public class ExectorThreadStatic implements Runnable{

    @Override
    public void run() {
        StaticLazySingletonFactory staticLazySingletonFactory = StaticLazySingletonFactory.getInstance();
        System.out.println(Thread.currentThread().getName() + "，" + staticLazySingletonFactory);
    }
}
