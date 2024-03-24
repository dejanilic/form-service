package com.heliant.formservice.service;

import com.heliant.formservice.domain.FormCompleted;

import java.util.List;

public interface FormCompletedService {

    List<FormCompleted> getAllFormsCompleted();

    int getFormsCompletedCountForPreviousDay();

}
