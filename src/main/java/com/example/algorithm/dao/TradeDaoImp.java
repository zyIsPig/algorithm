package com.example.algorithm.dao;

import com.example.algorithm.entity.ShoppingCart;
import com.example.algorithm.entity.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@Repository
public class TradeDaoImp implements TradeDao
{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public long addTrade(Trade trade)
    {
        String sql = "insert into Trade(ID,Due_time,Customer) " +
                "values(?,?,?)";
        jdbcTemplate.update(sql, trade.getId(), trade.getDueTime(), trade.getCustomer());

        ShoppingCartDapImp shoppingCartDapImp = new ShoppingCartDapImp();
        long Cart = shoppingCartDapImp.getCartIdbyCustomer(trade.getCustomer());
        List<Long> longList = shoppingCartDapImp.getItems(Cart);
        for (int i = 0; i < longList.size(); i++)
        {
            String sql1 = "insert into Trade_detail(ID,Algorithm) " +
                    "values(?,?)";
            jdbcTemplate.update(sql1, trade.getId(), longList.get(i));
        }
        return trade.getId();
    }

    @Override
    public int deleteTrade(long Tid)
    {
        String sql = "delete from Trade where ID=?";
        jdbcTemplate.update(sql, Tid);
        String sql2 = "delete from Trade_detail where ID=?";
        return (int) jdbcTemplate.update(sql2, Tid);
    }

    @Override
    public int SetTradeStatus(long Tid)
    {

        String sql = "select Status from Trade where ID = ?:";
        boolean b = jdbcTemplate.queryForObject(sql, Boolean.class, Tid);

        String sql2 = "UPDATE Trade SET State = ? where ID = ?";
        return jdbcTemplate.update(sql2, !b, Tid);
    }

    @Override
    public int SetTradeDue(long Tid, Timestamp timestamp)
    {
        String sql = "UPDATE Trade SET Due_time = ? where ID = ?";
        return jdbcTemplate.update(sql, timestamp, Tid);
    }

    @Override
    public List<Long> getAllTrades(long Cid)
    {
        String sql = "select ID from Trade where  Customer=?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Long>(Long.class), Cid);
    }
}
