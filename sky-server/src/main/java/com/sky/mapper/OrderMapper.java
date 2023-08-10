package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zc
 * @create 2023-08-10-15:48
 */
@Mapper
public interface OrderMapper {

    void insert(Orders orders);
}
