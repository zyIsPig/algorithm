package com.example.algorithm.dao;

import com.example.algorithm.entity.Customer;
import com.example.algorithm.entity.Trade;

import java.sql.Timestamp;
import java.util.List;

public interface TradeDao
{
    long addTrade(Trade trade);

    int deleteTrade(long Tid);

    int SetTradeStatus(long Tid);

    int SetTradeDue(long Tid, Timestamp due);

    List<Long> getAllTrades(long Cid);
}
