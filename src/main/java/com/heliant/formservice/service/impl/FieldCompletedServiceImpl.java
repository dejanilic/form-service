package com.heliant.formservice.service.impl;

import com.heliant.formservice.dao.FieldCompletedMapper;
import com.heliant.formservice.domain.FieldCompleted;
import com.heliant.formservice.service.FieldCompletedService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldCompletedServiceImpl implements FieldCompletedService {

    private FieldCompletedMapper fieldCompletedMapper;

    public FieldCompletedServiceImpl(FieldCompletedMapper fieldCompletedMapper) {
        this.fieldCompletedMapper = fieldCompletedMapper;
    }

    @Override
    public List<FieldCompleted> getAllFieldsCompleted() {
        return fieldCompletedMapper.getAllFieldsCompleted();
    }

}
