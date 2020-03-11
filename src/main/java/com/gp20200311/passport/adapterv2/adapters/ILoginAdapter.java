package com.gp20200311.passport.adapterv2.adapters;

import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public interface ILoginAdapter {
    boolean support(Object object);

    ResultMsg login(String id, Object adapter);
}
