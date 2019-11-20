package com.example.algorithm.dao;

import com.example.algorithm.entity.Customer;

import java.util.List;

public interface CustomerDao
{
    int addCustomer(Customer customer);

    int updatePassword(long id,String password);

    int deleteCustomer(long id);

    List<Customer> getCustomers();

    Customer findCustomerbyID(long id);

    Customer findCustomerbyName(String name);

    int login(String usename, String password);

    int setPhoto(long id, String Photo);

    int editIntro(long id,String intro);

    int addCart(long id);
}
