package com.gp20200313.delegatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doSomething(String task) {
        System.out.println("我是员工A，我开始做" + task);
    }
}
