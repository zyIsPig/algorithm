package com.example.algorithm.service;

import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.Trade;
import com.example.algorithm.entity.Customer;

public interface TradeService {

    /**
     *
     * @param customer
     * @param algorithm
     * @return 生成订单，之后在进行交易
     */
    public Trade generate(Customer customer, Algorithm algorithm);

    /**
     * 订单销毁
     */
    public void TradeDestory(Trade trade);

    /**
     * 改变订单状态
     * @param trade
     */
    public void changeTradeStatus(Trade trade);


}
