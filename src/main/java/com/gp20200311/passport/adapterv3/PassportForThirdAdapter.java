package com.gp20200311.passport.adapterv3;

import com.gp20200311.passport.ResultMsg;
import com.gp20200311.passport.adapterv3.adapters.ILoginAdapter;

import java.util.Map;

/**
 * 2020/3/11
 * author:ljh
 */
public class PassportForThirdAdapter implements IPassport {
    @Override
    public ResultMsg processLogin(Map<String, Object> params, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter loginAdapter = clazz.newInstance();
            if(loginAdapter.support(loginAdapter)) {
                return loginAdapter.login(params, loginAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
