package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * @author zc
 * @create 2023-08-09-16:57
 */
public interface ShoppingCartService {
    //添加购物车
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
    //查看购物车
    List<ShoppingCart> showShoppingCart();

    //清空购物车
    void cleanShoppingCart();
}
