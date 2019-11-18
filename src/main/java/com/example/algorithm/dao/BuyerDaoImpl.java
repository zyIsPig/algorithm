package com.example.algorithm.dao;

import com.example.algorithm.util.MD5Util;
import org.hibernate.usertype.CompositeUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.algorithm.dao.BuyerDao;
import com.example.algorithm.domain.Buyer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BuyerDaoImpl implements BuyerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addBuyer(Buyer buyer)
    {
        String sql = "insert into buyer(buyer_id,nick_name,login_name,password_md5,introduce_sign,create_time) " +
                "values(?,?,?,?,?,now())";
        Map<String, Object> param = new HashMap<>();
        return (int) jdbcTemplate.update(sql, buyer.getBuyer_id(), buyer.getNick_name(), buyer.getLogin_name(), MD5Util.string2MD5(buyer.getPassword_md5()), buyer.getIntroduce_sign());
    }

    @Override
    public int updatePassword(int id, String password)
    {
        password = MD5Util.string2MD5(password);
        Buyer buyer = findBuyerByID(id);
        String sql = "UPDATE buyer SET password_md5 = ? where buyer_id = ?";
        return jdbcTemplate.update(sql,password,buyer.getBuyer_id());
    }

    @Override
    public int deleteCustomer(Long id)
    {
        return 0;
    }

    @Override
    public int login(String username, String password)
    {
        password = MD5Util.string2MD5(password);
        String sql = "select count(*) from buyer where nick_name=? and password_md5=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, username, password);
    }

    @Override
    public List<Buyer> getBuyers()
    {
        String sql = "select * from buyer";
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(Buyer.class));
    }

    @Override
    public Buyer findBuyerByID(int id)
    {
        String sql = "select * from buyer where buyer_id = ?";
        RowMapper<Buyer> rowMapper = new BeanPropertyRowMapper<Buyer>(Buyer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);//最后一个参数为id值
    }

    @Override
    public Buyer findBuyerByName(String name)
    {
        String sql = "select * from buyer where nick_name = ?";
        RowMapper<Buyer> rowMapper = new BeanPropertyRowMapper<Buyer>(Buyer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, name);//最后一个参数为id值
    }


}
