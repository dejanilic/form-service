package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Field {

    enum FieldType {
        TEXT,
        NUMBER;
    }

    private Integer id;

    private Integer formId;

    private String title;

    private Integer orderNumber;

    private FieldType type;

    private Timestamp dateCreated;

    private Timestamp dateLastModified;

}
