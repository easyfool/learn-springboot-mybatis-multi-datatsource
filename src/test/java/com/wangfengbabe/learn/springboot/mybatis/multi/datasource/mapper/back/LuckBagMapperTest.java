package com.wangfengbabe.learn.springboot.mybatis.multi.datasource.mapper.back;

import static org.junit.Assert.*;

import com.wangfengbabe.learn.springboot.mybatis.multi.datasource.entity.LuckBagDO;
import com.wangfengbabe.learn.springboot.mybatis.multi.datasource.mapper.primary.LuckBagMapper1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LuckBagMapperTest {

    @Autowired
    private LuckBagMapper mapper;

    @Test
    public void testSelect(){
        LuckBagDO luckBagDO = mapper.selectByPrimaryKey(30L);
        System.out.println(luckBagDO);
    }

}