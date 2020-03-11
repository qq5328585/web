package com.gp20200308.safe;

import com.gp20200308.clear.Course;
import com.gp20200308.clear.CourseComponet;
import com.gp20200308.clear.CoursePackage;

/**
 * 2020/3/8
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("Root", 1);

        Node leaf1 = new LeafNode("leaf1", 1);
        Node leaf2 = new LeafNode("leaf2", 1);

        BranchNode branchNode = new BranchNode("branchNode", 2);
        Node branchLeaf1 = new LeafNode("branchLeaf1", 2);
        Node branchLeaf2 = new LeafNode("branchLeaf2", 2);

        branchNode.addChiled(branchLeaf1);
        branchNode.addChiled(branchLeaf2);

        root.addChiled(leaf1);
        root.addChiled(leaf2);
        root.addChiled(branchNode);

        root.show();
    }
}
