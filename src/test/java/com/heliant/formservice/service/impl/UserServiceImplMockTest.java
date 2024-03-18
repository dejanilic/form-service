package com.heliant.formservice.service.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.heliant.formservice.dao.UserMapper;
import com.heliant.formservice.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetailsService;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplMockTest {

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserServiceImpl userService;

    User user;

    @BeforeEach
    public void setUp() {
        user = new User(1, "username", "password", null, null);
    }

    // Simuliramo slučaj kada baza nije dostupna ili kada testiramo 3rd party dependency
    @Test
    public void testGetInfo() {
        given(userMapper.findByUsername(any())).willReturn(user);

        final User fetchedUser = userMapper.findByUsername("foo");

        assertThat(fetchedUser.getUsername(), is("username"));
        assertThat(fetchedUser.getPassword(), is("password"));
    }

}
