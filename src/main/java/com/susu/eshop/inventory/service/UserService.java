package com.susu.eshop.inventory.service;

import com.susu.eshop.inventory.model.User;

/**
 * @author SuyuZhuang
 * @date 2020/6/14 6:06 下午
 */
public interface UserService {
    /**
     * 查询用户信息
     *
     * @return 用户信息
     */
    User findUserInfo();

}
