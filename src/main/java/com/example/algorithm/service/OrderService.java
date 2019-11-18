package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm;
import com.example.algorithm.domain.Order;
import com.example.algorithm.domain.Buyer;

public interface OrderService {

    /**
     *
     * @param buyer
     * @param algorithm
     * @return 生成订单，之后在进行交易
     */
    public Order generate(Buyer buyer, Algorithm algorithm);

    /**
     * 订单销毁
     */
    public void OrderDestory(Order order);

    /**
     * 改变订单状态
     * @param order
     */
    public void changeOrderStatus(Order order);


}
