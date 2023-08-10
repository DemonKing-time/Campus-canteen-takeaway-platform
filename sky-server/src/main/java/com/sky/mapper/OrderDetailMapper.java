package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zc
 * @create 2023-08-10-15:49
 */
@Mapper
public interface OrderDetailMapper {
    //批量插入订单明细数据
    void insertBatch(List<OrderDetail> orderDetailList);
}
