package com.github.wangfeng.springboot.mybatis.datasource.mapper.db1;

import com.github.wangfeng.springboot.mybatis.datasource.entity.db1.PersonDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    @Qualifier("db1PersonMapper")
    private PersonMapper personMapper;

    @Test
    public void testSelect() {
        PersonDO insertDO = new PersonDO();
        insertDO.setUserName("test");
        int insert = personMapper.insert(insertDO);
        PersonDO personDO = personMapper.selectByPrimaryKey(insertDO.getId());
        System.out.println(personDO);
    }

}