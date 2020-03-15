package com.gp20200314.templatev2;

/**
 * 2020/3/13
 * author:ljh
 */
public interface ICourse {

    default public void createCourse() {
        //1.上传课件资料
        System.out.println("上传课件资料");

        //2.制作课件
        System.out.println("制作课件");

        //3.开始讲课
        System.out.println("开始讲课");

        //4.上传课后资料
        System.out.println("上传课后资料");

        //5.布置作业
        System.out.println("布置作业");

        //6.检查作业
        if(checkHomeWorkFlag()) {
            chekHomework();
        }
    }

    boolean checkHomeWorkFlag();

    void chekHomework();
}
