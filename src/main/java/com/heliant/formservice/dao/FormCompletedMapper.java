package com.heliant.formservice.dao;

import com.heliant.formservice.domain.FormCompleted;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FormCompletedMapper {

    List<FormCompleted> getAllFormsCompleted();

    int getFormsCompletedCountForPreviousDay();
}
