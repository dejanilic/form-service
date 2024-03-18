package com.heliant.formservice.service;

import com.heliant.formservice.domain.Form;

import java.util.List;

public interface FormService {

    Form getById(int formId);

    List<Form> getAllForms();

    Boolean createForm(Form form);

    Boolean updateForm(Form form);

    Boolean deleteById(int id);
}
