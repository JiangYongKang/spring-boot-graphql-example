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
    List<Member> all();
}
