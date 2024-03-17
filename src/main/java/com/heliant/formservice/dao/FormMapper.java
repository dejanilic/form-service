package com.heliant.formservice.dao;

import com.heliant.formservice.domain.Form;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FormMapper {

    List<Form> getAllForms();

}
