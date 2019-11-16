package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm.Algorithm;
import com.example.algorithm.domain.User.Buyer;

import java.util.List;

public interface AlgorithmService {
    /**
     * 降价/更新,通知   观察者
     * @param buyer
     *
     */
    public void register(Buyer buyer);

    public void remove(Buyer buyer);



    public void notify(List<Buyer> list);

    /**
     *关于算法的排序
     */
    public List<Algorithm> BestSellerList(Buyer buyer);







}
