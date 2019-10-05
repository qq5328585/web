package com.tj.ThreadTest;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 2019/10/4
 * author:ljh
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        //反射破坏单例
        try {
            Class clazz = HungrySingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);

            Object obj1 = c.newInstance();
            Object obj2 = HungrySingleton.getInstance();
            System.out.println("o1: " + obj1);
            System.out.println("o2: " + obj2);
            System.out.println(obj1 == obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //序列化破坏单例
        HungrySingleton s1 = null;
        HungrySingleton s2 = HungrySingleton.getInstance();
        FileOutputStream f1;

        try {
            f1 = new FileOutputStream("HungrySingleton.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(f1);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream f2 = new FileInputStream("HungrySingleton.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(f2);
            s1 = (HungrySingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("s1: " + s1);
            System.out.println("s2: " + s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
