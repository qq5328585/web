package com.gp20200304.gp;

/**
 * 2020/3/5
 * author:ljh
 * 提供最基础的组件
 */
public class BaseGpWeb implements GpWeb {

    @Override
    public String getNavbar() {
        return "问答,文章,精品课,冒泡,商城,搜索框,我要提问";
    }
}
