package com.gp20200313.templatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class JavaCourse extends AbstractCourse {
    private boolean checkHomeworkFlag = false;

    public void setCheckHomeworkFlag(boolean checkHomeworkFlag) {
        this.checkHomeworkFlag = checkHomeworkFlag;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.checkHomeworkFlag;
    }

    @Override
    protected void chekHomework() {
        System.out.println("检查JAVA作业");
    }
}
