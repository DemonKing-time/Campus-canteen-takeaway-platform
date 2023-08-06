package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zc
 * @create 2023-08-06-16:48
 */
@Mapper
public interface DishFlavorMapper {
    //批量插入口味
    void insertBatch(List<DishFlavor> flavors);
    //根据菜品id删除口味
    @Delete("delete from dish_flavor where dish_id=#{dishId}")
    void deleteByDishId(Long dishID);

    //根据菜品id查询对应的口味数据
    @Select("select * from dish_flavor where dish_id=#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
