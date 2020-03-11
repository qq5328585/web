package com.gp20200308.safe;

/**
 * 2020/3/8
 * author:ljh
 */
public class LeafNode extends Node {
    public LeafNode(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
