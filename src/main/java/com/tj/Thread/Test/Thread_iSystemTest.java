package com.tj.Thread.Test;

import com.tj.Thread.Thread_iSystem;

/**
 * 2019/10/2
 * author:ljh
 */
public class Thread_iSystemTest {
    public static void main(String[] args) {
        Thread_iSystem a = new Thread_iSystem();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
        Thread t4 = new Thread(a);
        Thread t5 = new Thread(a);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
