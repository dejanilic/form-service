package com.heliant.formservice.service.impl;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.heliant.formservice.BaseTest;
import com.heliant.formservice.domain.User;
import com.heliant.formservice.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootTest
class UserServiceImplTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;


    @BeforeEach
    public void setUp() {
        userService.createUserWithId(new User(10, "username", "password", null, null));
    }

    @AfterEach
    public void deleteAll() {
        userService.deleteById(10);
    }

    @Test
    public void loadUserByUsernameTest() {
        final UserDetails details = userDetailsService.loadUserByUsername("username");

        assertThat(details.getUsername(), is("username"));
        assertThat(details.getPassword(), is("password"));
    }

}