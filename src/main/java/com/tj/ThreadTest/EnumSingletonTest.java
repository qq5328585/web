package com.tj.ThreadTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Date;

/**
 * 2019/10/4
 * author:ljh
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton e1 = null;
        EnumSingleton e2 = EnumSingleton.getInstance();
        e2.setDate(new Date());

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("EnumSingleton.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("EnumSingleton.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            e1 = (EnumSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("e1: " + e1);
            System.out.println("e2: " + e2);
            System.out.println(e1 == e2);

            System.out.println("e1 Date: " + e1.getDate());
            System.out.println("e2 Date: " + e2.getDate());
            System.out.println(e1.getDate() == e2.getDate());

            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);

            EnumSingleton e = (EnumSingleton) c.newInstance("enum", 111);
            System.out.println("e: " + e);
            System.out.println("e2: " + e2);
            System.out.println(e == e2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
