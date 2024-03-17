package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class FormCompleted {

    private Integer id;

    private Integer formId;

    private Timestamp createdOn;

    private Timestamp modifiedOn;

}
