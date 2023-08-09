package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * 菜品接口
 * @author zc
 * @create 2023-08-06-15:56
 */
public interface DishService {
    //新增菜品和相应的口味
    public void saveWithFlavor(DishDTO dishDTO);
    //菜品分页查询
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    //菜品批量删除
    void deleteBatch(List<Long> ids);

    /**
     * 根据Id查询菜品
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    //根据id修改菜品的基本信息和口味信息
    void updateWithFlavor(DishDTO dishDTO);
    /**
     * 根据分类id查询菜品
     * @param categoryId
     * @return
     */
    List<Dish> list(Long categoryId);
}
