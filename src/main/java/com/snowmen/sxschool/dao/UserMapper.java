package com.snowmen.sxschool.dao;

import com.snowmen.sxschool.entity.User;

import java.util.List;

/**
 * @author Snow
 * @create 2021-04-27 14:36
 */
public interface UserMapper {

    /**
     * 获取全部的user用户
     * @return
     */
    List<User> getUserList();
}
