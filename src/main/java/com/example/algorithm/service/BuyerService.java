package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm;
import com.example.algorithm.domain.Buyer;

import javax.servlet.http.HttpSession;

public interface BuyerService {
    /**
     * 注册一个新用户
     * @param buyer
     */
    public void register(Buyer buyer);


    /**
     * 用户登录
     *
     */
    public boolean login(String username,String password);

    /**
     * 修改密码
     * @param buyer
     * @return
     */
    public boolean changePassword(Buyer buyer);

    /**
     * 更新用户信息
     * @param buyer
     * @param httpSession
     * @return
     */
    Buyer  updateBuyerInfo(Buyer buyer, HttpSession httpSession);

    public Buyer findByBuyername(String buyername);

    /**
     * 购物车
     *
     * removeFromShoppingCar:  传入 id， 移除购物车
     */
    public void addToShoppingCar(Buyer buyer, Algorithm algorithm);


    public void removeFromShoppingCar(Buyer buyer,int id);

    /**
     * 收藏夹
     *
     * 与上相同
     *
     */
    public  void collect (Buyer buyer,Algorithm algorithm);

    public void removeFromCollectList(Buyer buyer,int id);


    /**
     * 交易
     * userTrade:   提交购买申请
     */
    //public void userTrade(Buyer buyer,Algorithm algorithm);

//    public void Trade(Buyer buyer,Algorithm algorithm);

//    public void refund(Buyer buyer, Order order);







}
