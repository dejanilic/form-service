package com.heliant.formservice.service.impl;

import com.heliant.formservice.dao.FormCompletedMapper;
import com.heliant.formservice.domain.FormCompleted;
import com.heliant.formservice.service.FormCompletedService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormCompletedServiceImpl implements FormCompletedService {

    private FormCompletedMapper formCompletedMapper;

    public FormCompletedServiceImpl(FormCompletedMapper formCompletedMapper) {
        this.formCompletedMapper = formCompletedMapper;
    }

    @Override
    public List<FormCompleted> getAllFormsCompleted() {
        return formCompletedMapper.getAllFormsCompleted();
    }

}
