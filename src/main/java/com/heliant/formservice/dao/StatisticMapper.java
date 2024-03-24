package com.heliant.formservice.dao;

import com.heliant.formservice.domain.Statistic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StatisticMapper {

    int createStatistic(Statistic statistic);

}
