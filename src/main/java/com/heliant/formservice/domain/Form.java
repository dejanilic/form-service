package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Form {

    private Integer id;

    private String title;

    private Timestamp dateCreated;

    private Timestamp dateLastModified;

}
