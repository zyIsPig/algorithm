package com.example.algorithm.service;

import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.Customer;

import javax.servlet.http.HttpSession;

public interface CustomerService {
    /**
     * 注册一个新用户
     * @param customer
     */
    public void register(Customer customer);


    /**
     * 用户登录
     *
     */
    public boolean login(String username,String password);

    /**
     * 修改密码
     * @param customer
     * @return
     */
    public boolean changePassword(Customer customer, String password);

    /**
     * 更新用户信息
     * @param customer
     * @param httpSession
     * @return
     */
    Customer  updateCustomerInfo(Customer customer, String info);

    public Customer findByCustomername(String customername);

    /**
     * 购物车
     *
     * removeFromShoppingCar:  传入 id， 移除购物车
     */
    public void addToShoppingCar(Customer customer, Algorithm algorithm);


    public void removeFromShoppingCar(Customer customer,long id);

    /**
     * 收藏夹
     *
     * 与上相同
     *
     */
    public  void collect (Customer customer,Algorithm algorithm);

    public void removeFromCollectList(Customer customer,int id);


    /**
     * 交易
     * userTrade:   提交购买申请
     */
    //public void userTrade(CustomerRepository customer,Algorithm algorithm);

//    public void Trade(CustomerRepository customer,Algorithm algorithm);

//    public void refund(CustomerRepository customer, Order order);







}
