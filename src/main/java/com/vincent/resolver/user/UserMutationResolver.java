package com.vincent.resolver.user;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.vincent.entity.User;
import com.vincent.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Author: vincent
 * DateTime: 2018/11/30 0:29
 * Comment:
 */

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    @Resource
    private UserRepository userRepository;

    /**
     * 创建用户
     * @param user
     * @return
     */
    public User create(User user) {
        return userRepository.save(user);
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    public User update(User user) {
        return userRepository.save(user);
    }

    /**
     * 更新用户状态
     * @param id
     * @param status
     * @return
     */
    public User patch(Integer id, Integer status) {
        User user = userRepository.findById(id).orElse(new User());
        user.setStatus(status);
        return userRepository.save(user);
    }

    /**
     * 删除用户
     * @param id
     */
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

}
