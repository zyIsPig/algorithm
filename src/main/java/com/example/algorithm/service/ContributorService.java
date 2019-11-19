package com.example.algorithm.service;

import com.example.algorithm.entity.Contributor;

public interface ContributorService {
    /**
     * 商家注册
     * @param contributor
     */
    void register(Contributor contributor);

    /**
     * 商家登录
     * @param contributor
     */
    void login(Contributor contributor);

    /**
     * 修改密码
     * @param contributor
     */
    void changePassword(Contributor contributor);


}
