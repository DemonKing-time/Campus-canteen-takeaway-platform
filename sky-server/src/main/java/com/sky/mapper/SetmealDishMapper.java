package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zc
 * @create 2023-08-06-21:08
 */
@Mapper
public interface SetmealDishMapper {
    //根据菜品id查询对应的套餐Id
    List<Long> getSetmealIdbyDishIds(List<Long> dishIds);
}
