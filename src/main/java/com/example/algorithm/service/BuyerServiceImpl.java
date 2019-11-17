package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm.Algorithm;
import com.example.algorithm.domain.User.Buyer;

public class BuyerServiceImpl implements BuyerService {


    @Override
    public void register() {

    }

    @Override
    public void login(String username, String password) {

    }

    @Override
    public boolean changePassword(Buyer buyer) {
        return false;
    }

    @Override
    public void addToShoppingCar(Buyer buyer, Algorithm algorithm) {

    }

    @Override
    public void removeFromShoppingCar(Buyer buyer, int id) {

    }

    @Override
    public void collect(Buyer buyer, Algorithm algorithm) {

    }

    @Override
    public void removeFromCollectList(Buyer buyer, int id) {

    }
}
