package com.tj.pattern.singletonPattern.enumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 2019/9/28
 * author:ljh
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setDate(new Object());

        FileOutputStream f1;

        try {
            f1 = new FileOutputStream("EnumSingleton.dat");
            ObjectOutputStream o1 = new ObjectOutputStream(f1);
            o1.writeObject(s2);
            o1.flush();
            o1.close();

            FileInputStream f2 = new FileInputStream("EnumSingleton.dat");
            ObjectInputStream o2 = new ObjectInputStream(f2);
            s1 = (EnumSingleton) o2.readObject();

            System.out.println("s1: " + s1.getDate());
            System.out.println("s2: " + s2.getDate());
            System.out.println(s1.getDate() == s2.getDate());

            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton e = (EnumSingleton) c.newInstance("test", 123);
            System.out.println("e: " + e);
            System.out.println(e == s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
