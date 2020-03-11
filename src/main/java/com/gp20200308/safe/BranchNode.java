package com.gp20200308.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * 2020/3/8
 * author:ljh
 */
public class BranchNode extends Node {
    private List<Node> items = new ArrayList<Node>();

    private String name;
    private Integer level;

    public BranchNode(String name, Integer level) {
        super(name, level);
    }

    public void addChiled(Node node) {
        this.items.add(node);
    }

    public void removehiled(Node node) {
        this.items.remove(node);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Node node : items) {
            if(level != null) {
                for(int i = 0; i < level; i++) {
                    System.out.print("   ");
                }
                for(int i = 0; i < level; i++) {
                    if(i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            node.show();
        }
    }
}
