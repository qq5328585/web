package com.gp20200304.gp;

/**
 * 2020/3/5
 * author:ljh
 */
public class LoginGpWeb extends GpWebDecorator {

    public LoginGpWeb(GpWeb gpWeb) {
        super(gpWeb);
    }

    @Override
    public String getNavbar() {
        return super.getNavbar() + ",作业,题库,成长墙,站内信,通知,头像";
    }
}
