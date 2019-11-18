package com.example.algorithm.service;

import com.example.algorithm.domain.Owner;

public interface OwnerService {
    /**
     * 商家注册
     * @param owner
     */
    void register(Owner owner);

    /**
     * 商家登录
     * @param owner
     */
    void login(Owner owner);

    /**
     * 修改密码
     * @param owner
     */
    void changePassword(Owner owner);


}
