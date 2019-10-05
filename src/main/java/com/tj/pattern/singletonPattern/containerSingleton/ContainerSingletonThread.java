package com.tj.pattern.singletonPattern.containerSingleton;

/**
 * 2019/10/3
 * author:ljh
 */
public class ContainerSingletonThread implements Runnable{

    @Override
    public void run() {
        Object obj = ContainerSingleton.getInstance("com.tj.Test");
        System.out.println(System.currentTimeMillis() + ":" + obj);
    }
}
