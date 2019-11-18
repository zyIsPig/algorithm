package com.example.algorithm.dao;

import com.example.algorithm.domain.Buyer;

import java.util.List;

public interface BuyerDao {
    int addBuyer(Buyer buyer);

    int updatePassword(int id,String password);

    int deleteCustomer(Long id);

    List<Buyer> getBuyers();

    Buyer findBuyerByID(int id);

    Buyer findBuyerByName(String name);

    int login(String usename, String password);
}
