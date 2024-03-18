package com.heliant.formservice.dao;

import com.heliant.formservice.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findByUsername(String username);

}
