package com.example.algorithm.service;

import com.example.algorithm.dao.CustomerDaoImp;
import com.example.algorithm.dao.ShoppingCartDapImp;
import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    ShoppingCartDapImp shoppingCartDapImp;

    @Override
    public void addToShoppingCart(ShoppingCart shoppingCart, Algorithm algorithm){
        shoppingCartDapImp.addItem(shoppingCart.getCart(), algorithm.getId());
    }

    @Override
    public void deleteAlgorithm(ShoppingCart shoppingCart, Algorithm algorithm){
        shoppingCartDapImp.deleteItem(shoppingCart.getCart(), algorithm.getId());
    }

    @Override
    public void deleteAllAlgorithm(ShoppingCart shoppingCart){
        shoppingCartDapImp.deleteAll(shoppingCart.getCart());
    }

    @Override
    public void showAlgorithm(ShoppingCart shoppingCart){
        shoppingCartDapImp.getItems(shoppingCart.getCart());
    }

    @Override
    public void deleteAlgorithms(ShoppingCart shoppingCart, List<Algorithm> algorithms){
        for (Algorithm algorithm: algorithms
             ) {
            shoppingCartDapImp.deleteItem(shoppingCart.getCart(), algorithm.getId());
        }
    }
    @Override
    public long algorithmDetail(Algorithm algorithm){
        return algorithm.getId();
    }


}
