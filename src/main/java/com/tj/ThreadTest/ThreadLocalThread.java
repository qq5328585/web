package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class ThreadLocalThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + System.currentTimeMillis() + ":" + ThreadLocalSingleton.getInstance());
        }
    }
}
