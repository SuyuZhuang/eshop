package com.susu.eshop.inventory.dao;

/**
 * @author SuyuZhuang
 * @date 2020/6/14 7:07 下午
 */
public interface RedisDAO {
    void set(String key, String value);

    String get(String key);
}
