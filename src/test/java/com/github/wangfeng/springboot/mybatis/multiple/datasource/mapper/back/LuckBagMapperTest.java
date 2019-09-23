package com.github.wangfeng.springboot.mybatis.multiple.datasource.mapper.back;

import com.github.wangfeng.springboot.mybatis.multiple.datasource.entity.LuckBagDO;
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