package com.example.algorithm.dao;


import com.example.algorithm.util.MD5Util;
import org.hibernate.usertype.CompositeUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.algorithm.dao.CustomerDao;
import com.example.algorithm.entity.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDaoImp implements CustomerDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addCustomer(Customer customer)
    {
        String sql = "insert into Customer(Name,Password,Email,Createdtime,Photo) " +
                "values(?,?,?,now(),?)";
        return (int) jdbcTemplate.update(sql, customer.getName(), MD5Util.string2MD5(customer.getPassword()), customer.getEmail(), customer.getPhoto());
    }

    @Override
    public int updatePassword(long id, String password)
    {
        password = MD5Util.string2MD5(password);
        String sql = "UPDATE Customer SET Password = ? where ID = ?";
        return jdbcTemplate.update(sql, password, id);
    }

    @Override
    public int deleteCustomer(long id)
    {
        return 0;
    }

    @Override
    public int login(String username, String password)
    {
        password = MD5Util.string2MD5(password);
        String sql = "select count(*) from Customer where Name=? and Password=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, username, password);
    }

    @Override
    public int setPhoto(long id, String Photo)
    {
        String sql = "UPDATE Customer SET Photo = ? where ID = ?";
        return jdbcTemplate.update(sql, Photo, id);
    }

    @Override
    public int editIntro(long id, String intro)
    {
        String sql = "UPDATE Customer SET Intro = ? where ID = ?";
        return jdbcTemplate.update(sql, intro, id);
    }

    @Override
    public int addCart(long id)
    {
        String sql = "insert into Shopping_Cart(Customer) " +
                "values(?)";
        return (int) jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Customer> getCustomers()
    {
        String sql = "select * from buyer";
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(Customer.class));
    }

    @Override
    public Customer findCustomerbyID(long id)
    {
        String sql = "select * from Customer where ID = ?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<Customer>(Customer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);//最后一个参数为id值
    }

    @Override
    public Customer findCustomerbyName(String name)
    {
        String sql = "select * from Customer where Name = ?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<Customer>(Customer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, name);//最后一个参数为id值
    }


}
