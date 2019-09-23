package com.github.wangfeng.springboot.mybatis.datasource.service.impl;

import com.github.wangfeng.springboot.mybatis.datasource.entity.db1.PersonDO;
import com.github.wangfeng.springboot.mybatis.datasource.mapper.db1.PersonMapper;
import com.github.wangfeng.springboot.mybatis.datasource.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    @Qualifier("db1PersonMapper")
    private PersonMapper personMapper;

    @Transactional(value = "db1TransactionManager")
    @Override
    public void transact() {
        PersonDO updateDO =new PersonDO();
        updateDO.setId(1L);
        updateDO.setUserName("test update");
        personMapper.updateByPrimaryKey(updateDO);
        PersonDO insertDO = new PersonDO();
        //insertDO.setId(1L);
        insertDO.setUserName("another test");
        personMapper.insert(insertDO);
    }
}
