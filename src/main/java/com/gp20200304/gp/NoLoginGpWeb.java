package com.gp20200304.gp;

/**
 * 2020/3/5
 * author:ljh
 */
public class NoLoginGpWeb extends GpWebDecorator {

    public NoLoginGpWeb(GpWeb gpWeb) {
        super(gpWeb);
    }

    @Override
    public String getNavbar() {
        return super.getNavbar() + ",立即登录,免费注册";
    }
}
