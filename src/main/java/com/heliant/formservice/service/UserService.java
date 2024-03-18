package com.heliant.formservice.service;

import com.heliant.formservice.domain.User;

public interface UserService {

    void createUserWithId(User user);

    void deleteById(int id);

}
