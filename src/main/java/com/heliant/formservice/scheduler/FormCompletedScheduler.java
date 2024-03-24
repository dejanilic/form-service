package com.heliant.formservice.scheduler;

import com.heliant.formservice.domain.Statistic;
import com.heliant.formservice.service.FormCompletedService;
import com.heliant.formservice.service.StatisticService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FormCompletedScheduler {

    private FormCompletedService formCompletedService;

    private StatisticService statisticService;

    public FormCompletedScheduler(FormCompletedService formCompletedService, StatisticService statisticService) {
        this.formCompletedService = formCompletedService;
        this.statisticService = statisticService;
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void scheduleTaskUsingCronExpression() {
        int count = formCompletedService.getFormsCompletedCountForPreviousDay();
        Statistic statistic = new Statistic();
        statistic.setFormsCompletedNumber(count);

        // zakomentarisao jer puca
        // Cause: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry '1' for key 'statistics.PRIMARY'
        // statisticService.createStatistic(statistic);
    }

}
