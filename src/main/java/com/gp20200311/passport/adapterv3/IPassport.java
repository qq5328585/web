package com.gp20200311.passport.adapterv3;

import com.gp20200311.passport.ResultMsg;
import com.gp20200311.passport.adapterv3.adapters.ILoginAdapter;

import java.util.Map;

/**
 * 2020/3/11
 * author:ljh
 */
public interface IPassport {
    ResultMsg processLogin(Map<String, Object> params, Class<? extends ILoginAdapter> adapter);
}
