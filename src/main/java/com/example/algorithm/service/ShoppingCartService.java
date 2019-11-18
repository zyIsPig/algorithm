package com.example.algorithm.service;

import com.example.algorithm.domain.ShoppingCart;

public interface ShoppingCartService {
    /**
     * 保存算法到购物车
     * @param shoppingCart
     * @return
     */
    String addToShoppingCart(ShoppingCart shoppingCart);

    /**
     * 修改购物车中算法的属性
     * @param shoppingCart
     * @return
     */
    String updateShoppingCart(ShoppingCart shoppingCart);



}
