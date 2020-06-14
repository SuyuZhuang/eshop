package com.susu.eshop.inventory.mapper;

import com.susu.eshop.inventory.model.User;

/**
 * 测试用户的Mapper接口
 * @author SuyuZhuang
 * @date 2020/6/14 6:04 下午
 */
public interface UserMapper {
    /**
     * 查询测试用户的信息
     */
    User findUserInfo();
}
