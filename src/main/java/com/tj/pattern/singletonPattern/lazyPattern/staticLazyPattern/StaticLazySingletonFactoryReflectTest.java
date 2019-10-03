package com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern;

import java.lang.reflect.Constructor;

/**
 * 2019/9/28
 * author:ljh
 */
public class StaticLazySingletonFactoryReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = StaticLazySingletonFactory.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            Object o1 = c.newInstance();
            Object o2 = StaticLazySingletonFactory.getInstance();

            System.out.println("o1: " + o1);
            System.out.println("o2: " + o2);
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
