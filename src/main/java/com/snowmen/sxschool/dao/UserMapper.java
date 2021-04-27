package com.snowmen.sxschool.dao;

import com.snowmen.sxschool.entity.User;

import java.util.List;

/**
 * @author Snow
 * @create 2021-04-27 21:56
 */
public interface UserMapper {

    List<User> getUserList();
}
