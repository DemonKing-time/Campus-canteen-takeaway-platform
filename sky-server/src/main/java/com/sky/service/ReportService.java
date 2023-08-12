package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * @author zc
 * @create 2023-08-12-17:55
 */
public interface ReportService {
    //营业额统计（指定日期期间）
    TurnoverReportVO getTurnoverStatistics(LocalDate begin,LocalDate end);
}
