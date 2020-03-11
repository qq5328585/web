package com.gp20200311.passport.adapterv3.adapters;

import com.gp20200311.passport.ResultMsg;

import java.util.Map;

/**
 * 2020/3/11
 * author:ljh
 */
public interface ILoginAdapter {
    boolean support(Object object);

    ResultMsg login(Map<String, Object> params, Object adapter);
}
