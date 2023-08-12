package com.sky.task;

/**
 * 任务定时类
 * @author zc
 * @create 2023-08-12-9:54
 */
import com.sky.entity.Orders;
import com.sky.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Component
public class OrderTask {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 处理超时订单
     */
    //@Scheduled(cron = "0 * * * * ? ")//每分钟触发一次
    @Scheduled(cron = "1/5 * * * * ? ")
    public void processTimeoutOrder(){
        //当前时间减去15分钟
        LocalDateTime time = LocalDateTime.now().plusMinutes(-15);

        List<Orders> orderList = orderMapper.getByStatusAndOrdertimeLT(Orders.PENDING_PAYMENT, time);
        if(orderList!=null&&orderList.size()>0){
            for(Orders orders : orderList){
                orders.setStatus(Orders.CANCELLED);
                orders.setCancelReason("订单超时，自动取消");
                orders.setCancelTime(LocalDateTime.now());
                orderMapper.update(orders);
            }
        }
    }

    /**
     * 处理一直在派送中的订单
     */
    //@Scheduled(cron = "0 0 1 * * ?")//每天凌晨一点触发一次
    @Scheduled(cron = "0/5 * * * * ? ")
    public void processDeliveryOrder(){
        //上一个工作日
        LocalDateTime time = LocalDateTime.now().plusMinutes(-60);
        List<Orders> orderList = orderMapper.getByStatusAndOrdertimeLT(Orders.DELIVERY_IN_PROGRESS, time);

        if(orderList!=null&&orderList.size()>0) {
            for (Orders orders : orderList) {
                orders.setStatus(Orders.COMPLETED);
                orderMapper.update(orders);
            }
        }
    }
}
