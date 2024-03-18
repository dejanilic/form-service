package com.heliant.formservice.service.impl;

import com.heliant.formservice.dao.FieldMapper;
import com.heliant.formservice.domain.Field;
import com.heliant.formservice.domain.Form;
import com.heliant.formservice.service.FieldService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldServiceImpl implements FieldService {

    private FieldMapper fieldMapper;

    public FieldServiceImpl(FieldMapper fieldMapper) {
        this.fieldMapper = fieldMapper;
    }

    @Override
    public List<Field> getAllFields() {
        return fieldMapper.getAllFields();
    }

}
