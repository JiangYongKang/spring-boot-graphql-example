package com.vincent.mybatis.example.mapper;

import com.vincent.mybatis.example.model.Setting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Author: vincent
 * Date: 2018-08-09 21:50:00
 * Comment:
 */

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class SettingMapperTests {

    @Resource
    private SettingMapper mapper;

    @Before
    public void beforeAction() {
        mapper.save(new Setting(1L, 1L, "vincent", "M", 18, "ShangHai"));
        mapper.save(new Setting(2L, 2L, "elena", "M", 18, "ShangHai"));
        mapper.save(new Setting(3L, 3L, "max", "M", 18, "ShangHai"));
    }

    @Test
    public void findByMemberIdTest() {
        Setting setting = mapper.findByMemberId(1L);
        Assert.assertNotNull(setting);
        Assert.assertEquals(setting.getNickname(), "vincent");
    }
}
