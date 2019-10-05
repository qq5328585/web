package com.tj.pattern.singletonPattern.threadLoacal;

/**
 * 2019/10/3
 * author:ljh
 */
public class ThreadLocalSingletonThread implements Runnable{

    @Override
    public void run() {
        ThreadLocalSingleton t = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis() + ":" + t);
    }
}
