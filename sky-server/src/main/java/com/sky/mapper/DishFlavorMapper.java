package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zc
 * @create 2023-08-06-16:48
 */
@Mapper
public interface DishFlavorMapper {
    //批量插入口味
    void insertBatch(List<DishFlavor> flavors);
}
