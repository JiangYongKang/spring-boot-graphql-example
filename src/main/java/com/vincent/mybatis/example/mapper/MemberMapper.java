package com.vincent.mybatis.example.mapper;

import com.vincent.mybatis.example.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: vincent
 * Date: 2018-08-07 23:22:00
 * Comment:
 */

@Mapper
public interface MemberMapper {

    /**
     * 查询全部成员
     * @return
     */
    List<Member> selectAll();

    /**
     * 按主键查询成员
     * @param id
     * @return
     */
    Member findById(Long id);

    /**
     * 查询新插入的成员
     * @return
     */
    Member first();

    /**
     * 按邮箱查询成员
     * @param email
     * @return
     */
    Member findByEmail(String email);

    /**
     * 保存成员
     * @param member
     * @return
     */
    Boolean save(Member member);

    /**
     * 更新成员
     * @param member
     * @return
     */
    Boolean update(Member member);

    /**
     * 根据主键删除成员
     * @param id
     * @return
     */
    Boolean destroy(Long id);
}
