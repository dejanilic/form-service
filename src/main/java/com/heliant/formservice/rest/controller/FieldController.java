package com.heliant.formservice.rest.controller;

import com.heliant.formservice.domain.Field;
import com.heliant.formservice.domain.Form;
import com.heliant.formservice.service.FieldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FieldController {

    private FieldService fieldService;

    public FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @GetMapping("fields")
    public List<Field> getAllForms() {
        return fieldService.getAllFields();
    }

}
