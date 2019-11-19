package com.example.algorithm.service;

import com.example.algorithm.dao.CustomerDaoImp;
import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDaoImp customerDaoImp;

    @Override
    public void register(Customer customer) {
        customerDaoImp.addCustomer(customer);
    }

    @Override
    public boolean login(String username, String password) {
        boolean flag = false;
        if (customerDaoImp.login(username, password) == 1){
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean changePassword(Customer customer, String password) {
        boolean flag = false;

        if (customerDaoImp.updatePassword(customer.getId(), password)==1){
            flag = true;
        }

        return flag;
    }

    @Override
    public Customer updateCustomerInfo(Customer customer, String  info) {
       customerDaoImp.editIntro(customer.getId(), info);
       return customer;
    }

    @Override
    public Customer findByCustomername(String customername) {
        return customerDaoImp.findCustomerbyName(customername);
    }

    @Override
    public void addToShoppingCar(Customer customer, Algorithm algorithm) {

    }

    @Override
    public void removeFromShoppingCar(Customer customer, long id) {

    }

    @Override
    public void collect(Customer customer, Algorithm algorithm) {

    }

    @Override
    public void removeFromCollectList(Customer customer, int id) {

    }
}
