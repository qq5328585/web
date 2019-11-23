package com.ssm.demo.service.impl;

import com.ssm.demo.dao.PersonMapperDao;
import com.ssm.demo.entity.Person;
import com.ssm.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2019/11/23
 * author:ljh
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapperDao personMapperDao;

    @Override
    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}
