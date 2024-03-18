package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Getter
@Setter
public class Form {

    private Integer id;

    @NotBlank(message = "Title must not be blank")
    private String title;

    private Timestamp createdOn;

    private Timestamp modifiedOn;

}
