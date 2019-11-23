package com.ssm.demo.dao;

import com.ssm.demo.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * 2019/11/23
 * author:ljh
 */
@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}
