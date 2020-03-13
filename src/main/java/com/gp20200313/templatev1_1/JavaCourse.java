package com.gp20200313.templatev1_1;

/**
 * 2020/3/13
 * author:ljh
 */
public class JavaCourse extends AbstractCourse {
    public void course() {
        super.createCourse(new CheckFlag() {
            @Override
            public boolean getFlag() {
                return true;
            }
        }, "JAVA");
    }
}
