package com.heliant.formservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Statistic {

    private Integer id;

    private Date date;

    private Integer formsCompletedNumber;

}
