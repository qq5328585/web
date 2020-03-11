package com.gp20200311.passport.adapterv2.adapters;

import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public class LoginPhoneAdapter extends AbstractLogin {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginPhoneAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id, null);
    }
}
