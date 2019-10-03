package com.tj.Thread;

/**
 * 2019/10/2
 * author:ljh
 */
public class Thread_iSystem implements Runnable {
    private int count = 5;

    @Override
    public void run() {
        System.out.println("count: " + count-- + " thread-name: " + Thread.currentThread().getName());
    }
}
