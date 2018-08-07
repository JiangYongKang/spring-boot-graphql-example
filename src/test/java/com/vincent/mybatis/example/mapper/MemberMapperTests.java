package com.vincent.mybatis.example.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Author: vincent
 * Date: 2018-08-07 23:33:00
 * Comment:
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberMapperTests {

    @Resource
    private MemberMapper mapper;

    @Test
    public void allTest() {
        Assert.assertFalse(mapper.all().isEmpty());
    }
}
