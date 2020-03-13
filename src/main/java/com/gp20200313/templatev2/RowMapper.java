package com.gp20200313.templatev2;

import java.sql.ResultSet;

/**
 * 2020/3/13
 * author:ljh
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
