package com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern.seriableSingleton;

import com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern.StaticLazySingletonFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 2019/9/28
 * author:ljh
 */
public class StaticLazySingletonFactorySerializationTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream f1;

        try {
            f1 = new FileOutputStream("SeriableSingleton.dat");
            ObjectOutputStream o1 = new ObjectOutputStream(f1);
            o1.writeObject(s2);
            o1.flush();
            o1.close();

            FileInputStream f2 = new FileInputStream("SeriableSingleton.dat");
            ObjectInputStream o2 = new ObjectInputStream(f2);
            s1 = (SeriableSingleton)o2.readObject();
            o2.close();

            System.out.println("s1: " + s1);
            System.out.println("s2: " + s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
