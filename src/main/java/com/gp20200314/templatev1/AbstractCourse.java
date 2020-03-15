package com.gp20200314.templatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public abstract class AbstractCourse {

    public final void createCourse() {
        //1.上传课件资料
        uploadBeforeCourseInfo();

        //2.制作课件
        createCourseware();

        //3.开始讲课
        startCourse();

        //4.上传课后资料
        uploadAfterCourseInfo();

        //5.布置作业
        uploadHomeWork();

        //6.检查作业
        if(checkHomeWorkFlag()) {
            chekHomework();
        }
    }

    protected abstract boolean checkHomeWorkFlag();

    protected abstract void chekHomework();

    private void uploadBeforeCourseInfo() {
        System.out.println("上传课件资料");
    }

    private void createCourseware() {
        System.out.println("制作课件");
    }

    private void startCourse() {
        System.out.println("开始讲课");
    }

    private void uploadAfterCourseInfo() {
        System.out.println("上传课后资料");
    }

    private void uploadHomeWork() {
        System.out.println("布置作业");
    }
}
