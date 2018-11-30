package com.vincent.resolver.user;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.vincent.entity.User;
import com.vincent.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: vincent
 * DateTime: 2018/11/30 0:04
 * Comment:
 */

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    @Resource
    private UserRepository userRepository;

    /**
     * 用户列表
     * @return
     */
    public Iterable<User> index() {
        return userRepository.findAll();
    }

    /**
     * 用户详情
     * @param id
     * @return
     */
    public User show(Integer id) {
        return userRepository.findById(id).orElse(new User());
    }

}
