package com.tj.pattern.singletonPattern.threadLoacal;

/**
 * 2019/10/3
 * author:ljh
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSinleton
            = new ThreadLocal<ThreadLocalSingleton>() {
            @Override
            protected ThreadLocalSingleton initialValue(){
                return new ThreadLocalSingleton();
            }
        };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSinleton.get();
    }
}
