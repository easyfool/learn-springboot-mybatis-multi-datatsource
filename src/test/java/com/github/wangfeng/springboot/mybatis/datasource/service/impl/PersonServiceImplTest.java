package com.github.wangfeng.springboot.mybatis.datasource.service.impl;

import static org.junit.Assert.*;

import com.github.wangfeng.springboot.mybatis.datasource.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceImplTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testTransact() {
        personService.transact();

    }

}