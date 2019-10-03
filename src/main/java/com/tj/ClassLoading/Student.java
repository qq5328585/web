package com.tj.ClassLoading;

/**
 * 2019/10/3
 * author:ljh
 */
public class Student extends Person {
    School sc = new School();

    public Student() {
        System.out.println("student");
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}
