package com.tj;

/**
 * 2019/8/31
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("你好啊");
        System.out.println("你好啊");
        User u1 = new User();
        User u2 = new User();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.getUser(u2));
    }
}
