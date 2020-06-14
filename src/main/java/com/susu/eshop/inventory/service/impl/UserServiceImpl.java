package com.susu.eshop.inventory.service.impl;

import com.susu.eshop.inventory.mapper.UserMapper;
import com.susu.eshop.inventory.model.User;
import com.susu.eshop.inventory.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SuyuZhuang
 * @date 2020/6/14 6:07 下午
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }
}
