package com.gp20200313.delegatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class Task {
    public static void main(String[] args) {
        new Boss().commond("编程", new Leader());
    }
}
