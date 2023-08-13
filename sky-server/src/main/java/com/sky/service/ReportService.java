package com.sky.service;

import com.sky.vo.OrderReportVO;
import com.sky.vo.SalesTop10ReportVO;
import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

/**
 * @author zc
 * @create 2023-08-12-17:55
 */
public interface ReportService {
    //营业额统计（指定日期期间）
    TurnoverReportVO getTurnoverStatistics(LocalDate begin,LocalDate end);
    //用户统计
    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);
    //统计指定时间区间内的订单数据
    OrderReportVO getUOrderStatistics(LocalDate begin, LocalDate end);
    //销量排名
    SalesTop10ReportVO getSalesTop10(LocalDate begin, LocalDate end);

    
}
