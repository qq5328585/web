package com.gp20200314.templatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class JavaCourse  {
    public void course() {
        new AbstractCourse() {
            @Override
            protected boolean checkHomeWorkFlag() {
                return true;
            }

            @Override
            protected void chekHomework() {
                System.out.println("检查JAVA作业");
            }
        }.createCourse();
    }
}
