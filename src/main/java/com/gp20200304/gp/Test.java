package com.gp20200304.gp;

/**
 * 2020/3/5
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        GpWeb gpWeb = new BaseGpWeb();
        System.out.println("基础组件导航栏展示:" + gpWeb.getNavbar());

        GpWebDecorator gpWebDecorator = new NoLoginGpWeb(gpWeb);
        System.out.println("未登录导航栏展示: " + gpWebDecorator.getNavbar());

        gpWebDecorator = new LoginGpWeb(gpWeb);
        System.out.println("登录导航栏展示: " + gpWebDecorator.getNavbar());
    }
}
