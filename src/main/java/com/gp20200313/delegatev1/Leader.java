package com.gp20200313.delegatev1;

import java.util.HashMap;
import java.util.Map;

/**
 * 2020/3/13
 * author:ljh
 */
public class Leader implements IEmployee {
    private Map<String, IEmployee> employeeMap;

    public Leader() {
        employeeMap = new HashMap<String, IEmployee>();
        employeeMap.put("编程", new EmployeeA());
        employeeMap.put("平面设计", new EmployeeB());
    }

    @Override
    public void doSomething(String task) {
        if(employeeMap.containsKey(task)) {
            employeeMap.get(task).doSomething(task);
        } else {
            System.out.println("我没办法做");
        }
    }
}
