package com.gp20200311.passport.adapterv3.adapters;

import com.gp20200311.passport.ResultMsg;

import java.util.Map;

/**
 * 2020/3/11
 * author:ljh
 */
public class LoginDYAdapter extends AbstractLogin {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginDYAdapter;
    }

    @Override
    public ResultMsg login(Map<String, Object> params, Object adapter) {
        if(params == null || params.isEmpty() || params.get("username") == null || "".equals(params.get("username"))) {
            return null;
        } else {
            return super.login(params.get("username").toString(), null);
        }
    }
}
