package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class User {

    private Integer id;

    private String username;

    private String password;

    private Timestamp createdOn;

    private Timestamp modifiedOn;

}
