package com.heliant.formservice.service.impl;

import com.heliant.formservice.dao.StatisticMapper;
import com.heliant.formservice.domain.Statistic;
import com.heliant.formservice.service.StatisticService;
import org.springframework.stereotype.Service;

@Service
public class StatisticServiceImpl implements StatisticService {

    private StatisticMapper statisticMapper;

    public StatisticServiceImpl(StatisticMapper statisticMapper) {
        this.statisticMapper = statisticMapper;
    }

    @Override
    public void createStatistic(Statistic statistic) {
        statisticMapper.createStatistic(statistic);
    }

}
