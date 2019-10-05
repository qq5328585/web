package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class ContainerSingletonThread implements Runnable {

    @Override
    public void run() {
        Object obj = ContainerSingleton.getInstance("com.tj.Test");
        System.out.println(System.currentTimeMillis() + ":" + obj);
    }
}
