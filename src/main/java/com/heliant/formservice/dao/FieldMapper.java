package com.heliant.formservice.dao;

import com.heliant.formservice.domain.Field;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FieldMapper {

    List<Field> getAllFields();

}
