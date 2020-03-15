package com.gp20200314.templatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class PythonCourse {
    public void course() {
        new AbstractCourse() {
            @Override
            protected boolean checkHomeWorkFlag() {
                return false;
            }

            @Override
            protected void chekHomework() {
                System.out.println("检查PYTHON作业");
            }
        }.createCourse();
    }
}
