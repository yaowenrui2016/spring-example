package com.rui.lauth.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * yaowr
 * 2019/5/19
 */
@Getter
@Setter
public class User {
    /**
     * id
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;
}