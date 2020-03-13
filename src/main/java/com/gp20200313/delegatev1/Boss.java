package com.gp20200313.delegatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class Boss {
    public void commond(String task, Leader leader) {
        leader.doSomething(task);
    }
}
