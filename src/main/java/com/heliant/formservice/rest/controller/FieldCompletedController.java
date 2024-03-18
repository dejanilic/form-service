package com.heliant.formservice.rest.controller;

import com.heliant.formservice.domain.FieldCompleted;
import com.heliant.formservice.service.FieldCompletedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FieldCompletedController {

    private FieldCompletedService fieldCompletedService;

    public FieldCompletedController(FieldCompletedService fieldCompletedService) {
        this.fieldCompletedService = fieldCompletedService;
    }

    @GetMapping("fieldscompleted")
    public List<FieldCompleted> getAllForms() {
        return fieldCompletedService.getAllFieldsCompleted();
    }

}
