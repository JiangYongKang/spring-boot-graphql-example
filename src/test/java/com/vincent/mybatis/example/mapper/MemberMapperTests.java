package com.vincent.mybatis.example.mapper;

import com.vincent.mybatis.example.model.Member;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: vincent
 * Date: 2018-08-07 23:33:00
 * Comment:
 */

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberMapperTests {

    @Resource
    private MemberMapper mapper;

    @Before
    public void beforeAction() {
        mapper.save(new Member("vincent@mail.com", "123456"));
        mapper.save(new Member("elena@mail.com", "123456"));
        mapper.save(new Member("max@mail.com", "123456"));
    }

    @Test
    public void selectAllTest() {
        Assert.assertNotNull(mapper.selectAll());
        Assert.assertEquals(mapper.selectAll().size(), 3);
    }

    @Test
    public void findByIdTest() {
        Member member = mapper.first();
        Assert.assertNotNull(mapper.findById(member.getId()));
    }

    @Test
    public void findByEmailTest() {
        Assert.assertNotNull(mapper.findByEmail("vincent@mail.com"));
    }

    @Test
    public void updateTest() {
        Member member = mapper.first();
        member.setEmail("bonnie@mail.com");
        Assert.assertTrue(mapper.update(member));
        Assert.assertEquals(mapper.findById(member.getId()).getEmail(), "bonnie@mail.com");
    }

    @Test
    public void destroyTest() {
        List<Member> members = mapper.selectAll();
        Assert.assertEquals(members.size(), 3);
        Assert.assertTrue(mapper.destroy(members.get(1).getId()));
        Assert.assertEquals(mapper.selectAll().size(), 2);
    }
}
