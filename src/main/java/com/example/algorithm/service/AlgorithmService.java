package com.example.algorithm.service;

import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.Customer;

import java.util.List;

public interface AlgorithmService {
    /**
     * 降价/更新,通知   观察者
     * @param customer
     *
     */
    public void register(Customer customer);

    /**
     * 买家删除关注列表
     * @param customer
     */
    public void remove(Customer customer);


    public void notify(List<Customer> list);

    /**
     *关于算法的排序
     */
    public List<Algorithm> BestSellerList(Customer customer);







}
