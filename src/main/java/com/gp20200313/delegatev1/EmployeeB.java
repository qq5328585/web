package com.gp20200313.delegatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doSomething(String task) {
        System.out.println("我是员工B，我开始做" + task);
    }
}
