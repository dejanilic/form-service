package com.heliant.formservice.dao;

import com.heliant.formservice.domain.Form;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FormMapper {

    Form getById(int id);

    List<Form> getAllForms();

    int createForm(Form form);

    int updateForm(Form form);

    int deleteById(int id);
}
