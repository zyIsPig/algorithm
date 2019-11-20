package com.example.algorithm.service;

import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    /**
     * 添加算法到购物车
     * @param shoppingCart
     * @return
     */
    void addToShoppingCart(ShoppingCart shoppingCart, Algorithm algorithm);

    /**
     * 从购物车里面删除算法
     * @param shoppingCart
     * @param algorithm
     */
    void deleteAlgorithm(ShoppingCart shoppingCart, Algorithm algorithm);

    /**
     * 删除购物车里面所有算法
     * @param shoppingCart
     */
    void deleteAllAlgorithm(ShoppingCart shoppingCart);

    /**
     * 展示购物车里面的算法
     * @param shoppingCart
     */
    void showAlgorithm(ShoppingCart shoppingCart);

    /**
     * 批量删除
     * @param algorithms
     */
    void deleteAlgorithms(ShoppingCart shoppingCart, List<Algorithm> algorithms);

    /**
     * 得到算法详情
     * @param algorithm
     */
    long algorithmDetail(Algorithm algorithm);

}
