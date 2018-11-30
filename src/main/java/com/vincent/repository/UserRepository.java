package com.vincent.repository;

import com.vincent.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: vincent
 * DateTime: 2018/11/30 0:00
 * Comment:
 */

public interface UserRepository extends CrudRepository<User, Integer> {
}
