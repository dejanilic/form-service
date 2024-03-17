package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class FieldCompleted {

    private Integer id;

    private Integer formCompletedId;

    private Integer fieldId;

    private String valueText;

    private Double valueNumber;

    private Timestamp createdOn;

    private Timestamp modifiedOn;

}
