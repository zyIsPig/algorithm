package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm.Algorithm;
import com.example.algorithm.domain.User.Buyer;
import org.springframework.core.annotation.Order;

public interface BuyerService {

    public void register(Buyer buyer);


    /**
     *
     *
     */

    public boolean login(String username,String password);

    public boolean changePassword(Buyer buyer);

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
