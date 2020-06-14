package com.susu.eshop.inventory.dao.impl;

import com.susu.eshop.inventory.dao.RedisDAO;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * @author SuyuZhuang
 * @date 2020/6/14 7:07 下午
 */
@Repository("redisDAO")
public class RedisDAOImpl implements RedisDAO {
    @Resource
    private JedisCluster jedisCluster;

    @Override
    public void set(String key, String value) {
        jedisCluster.set(key, value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }
}
