package com.gp20200308.safe;

/**
 * 2020/3/8
 * author:ljh
 */
public abstract class Node {
    protected String name;
    protected Integer level;

    public Node(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public abstract void show();
}
