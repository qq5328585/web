package com.tj.pattern.singletonPattern.lazyPattern;

/**
 * 2019/9/21
 * author:ljh
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
        LazySingletonFactory lazy = LazySingletonFactory.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);
    }
}
