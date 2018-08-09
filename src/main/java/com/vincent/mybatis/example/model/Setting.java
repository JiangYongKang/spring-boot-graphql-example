package com.vincent.mybatis.example.model;

import lombok.Data;

/**
 * Author: vincent
 * Date: 2018-08-09 21:43:00
 * Comment:
 */

@Data
public class Setting {

    private Long id;
    private Long memberId;
    private String nickname;
    private String sex;
    private Integer age;
    private String location;

    public Setting() {
    }

    public Setting(Long id, Long memberId, String nickname, String sex, Integer age, String location) {
        this.id = id;
        this.memberId = memberId;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        this.location = location;
    }
}
