package com.vincent.mybatis.example.mapper;

import com.vincent.mybatis.example.model.Setting;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: vincent
 * Date: 2018-08-09 21:46:00
 * Comment:
 */

@Mapper
public interface SettingMapper {

    /**
     * 保存成员设置
     * @param setting
     * @return
     */
    Boolean save(Setting setting);

    /**
     * 按成员ID查询成员设置
     * @param memberId
     * @return
     */
    Setting findByMemberId(Long memberId);

}
