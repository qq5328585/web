package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object obj = ContainerSingleton.getInstance("com.tj.Test");
        System.out.println(System.currentTimeMillis() + ":" + obj);
        Object obj1 = ContainerSingleton.getInstance("com.tj.Test");
        System.out.println(System.currentTimeMillis() + ":" + obj1);
        Object obj2 = ContainerSingleton.getInstance("com.tj.Test");
        System.out.println(System.currentTimeMillis() + ":" + obj2);

        Thread t1 = new Thread(new ContainerSingletonThread());
        Thread t2 = new Thread(new ContainerSingletonThread());

        t1.start();
        t2.start();

        Object o = new Object();
        System.out.println(o);
    }
}
