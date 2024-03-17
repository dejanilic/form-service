package com.heliant.formservice.dao;

import com.heliant.formservice.domain.FieldCompleted;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FieldCompletedMapper {

    List<FieldCompleted> getAllFieldsCompleted();

}
