package com.example.algorithm.dao;

import com.example.algorithm.entity.Algorithm;

import java.util.*;

public interface ShoppingCartDao
{
    int addItem(long Cid, long Aid);

    int deleteItem(long Cid, long Aid);

    long getCartIdbyCustomer(long id);

    long getCustomerIdbyCart(long id);

    List<Long> getItems(long Cid);

    int deleteAll(long Cid);
}
