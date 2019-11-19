package com.example.algorithm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShoppingCartDapImp implements ShoppingCartDao
{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addItem(long Cid, long Aid)
    {
        String sql = "insert into Cart_detail(Cart,Algorithm) " +
                "values(?,?)";
        return (int) jdbcTemplate.update(sql, Cid, Aid);
    }

    @Override
    public int deleteItem(long Cid, long Aid)
    {
        String sql = "delete from Cart_detail where Cart=?  and Algorithm=?";
        return (int) jdbcTemplate.update(sql, Cid, Aid);
    }

    @Override
    public long getCartIdbyCustomer(long id)
    {
        String sql = "select Customer from Shopping_Cart where id = ?";
        return jdbcTemplate.queryForObject(sql, Long.class, id);
    }

    @Override
    public long getCustomerIdbyCart(long id)
    {
        String sql = "select id from Shopping_Cart where Customer = ?";
        return jdbcTemplate.queryForObject(sql, Long.class, id);
    }

    @Override
    public List<Long> getItems(long Cid)
    {
        String sql = "select Algorithm from Cart_detail where Cart =?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Long>(Long.class), Cid);
    }

    @Override
    public int deleteAll(long Cid)
    {
        String sql = "delete from Cart_detail where Cart=?";
        return (int) jdbcTemplate.update(sql, Cid);
    }


}
