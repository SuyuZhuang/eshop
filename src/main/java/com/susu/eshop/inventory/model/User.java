package com.susu.eshop.inventory.model;

/**
 * 用户Model类
 * @author SuyuZhuang
 * @date 2020/6/14 6:01 下午
 */
public class User {
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
