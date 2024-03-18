package com.heliant.formservice.rest.controller;

import com.heliant.formservice.domain.FormCompleted;
import com.heliant.formservice.service.FormCompletedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FormCompletedController {

    private FormCompletedService formCompletedService;

    public FormCompletedController(FormCompletedService formCompletedService) {
        this.formCompletedService = formCompletedService;
    }

    @GetMapping("formscompleted")
    public List<FormCompleted> getAllForms() {
        return formCompletedService.getAllFormsCompleted();
    }

}
