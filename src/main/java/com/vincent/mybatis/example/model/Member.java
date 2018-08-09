package com.vincent.mybatis.example.model;

import lombok.Data;

/**
 * Author: vincent
 * Date: 2018-08-07 23:20:00
 * Comment:
 */

@Data
public class Member {

    private Long id;
    private String email;
    private String password;
    private Setting setting;

    public Member() {
    }

    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
