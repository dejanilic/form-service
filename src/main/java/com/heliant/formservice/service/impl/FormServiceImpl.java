package com.heliant.formservice.service.impl;

import com.heliant.formservice.dao.FormMapper;
import com.heliant.formservice.domain.Form;
import com.heliant.formservice.service.FormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FormServiceImpl implements FormService {

    private FormMapper formMapper;

    public FormServiceImpl(FormMapper formMapper) {
        this.formMapper = formMapper;
    }

    @Override
    public Form getById(int formId) {
        return formMapper.getById(formId);
    }

    @Override
    public List<Form> getAllForms() {
        return formMapper.getAllForms();
    }

    @Override
    public Boolean createForm(Form form) {
        log.info("Called createForm(Form form)");
        Boolean created = false;

        try {
            if (formMapper.createForm(form) == 1) {
                created = true;
            }
        } catch (Exception e) {
            log.error("Exception during form creation: {}", e);
        }

        log.info("Executed createForm(Form form)");
        return created;
    }

    @Override
    public Boolean updateForm(Form form) {
        log.info("Called updateForm(Form form)");
        Boolean updated = false;
        
        if (formMapper.updateForm(form) == 1) {
            updated = true;
        }

        log.info("Executed updateForm(Form form)");
        return updated;
    }

    @Override
    public Boolean deleteById(int id) {
        log.info("Called deleteById(int id)");
        Boolean deleted = false;

        if (formMapper.deleteById(id) == 1) {
            deleted = true;
        }

        log.info("Executed deleteById(int id)");
        return deleted;
    }

}
