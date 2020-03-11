package com.gp20200304.gp;

/**
 * 2020/3/5
 * author:ljh
 * GP网页抽象装饰类,由于不能确定具体装饰类有哪些,不能确定具体展示哪些导航栏,故用抽象来修饰类
 */
public abstract class GpWebDecorator implements GpWeb {
    private GpWeb gpWeb;

    public GpWebDecorator(GpWeb gpWeb) {
        this.gpWeb = gpWeb;
    }

    /**
     * 如果想要保护方法不被调用,可以采用protected,那么就不能用接口,应使用抽象类作为抽象构件
     * @return 导航栏内容
     */
    @Override
    public String getNavbar() {
        return this.gpWeb.getNavbar();
    }
}
