package com.heliant.formservice.rest.controller;

import com.heliant.formservice.domain.Form;
import com.heliant.formservice.rest.dto.FormResponse;
import com.heliant.formservice.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class FormController {

    private FormService formService;

    public FormController(FormService formService) {
        this.formService = formService;
    }

    @GetMapping("forms/{id}")
    public ResponseEntity<FormResponse> getById(@PathVariable int id) {
        Form form = formService.getById(id);

        FormResponse response = FormResponse.builder()
                .status(HttpStatus.OK)
                .message("Form fetched.")
                .forms(Arrays.asList(form))
                .build();

        return new ResponseEntity<FormResponse>(response, response.getStatus());
    }

    @GetMapping("forms")
    public ResponseEntity<FormResponse> getAllForms() {
        List<Form> forms = formService.getAllForms();

        FormResponse response = FormResponse.builder()
                .status(HttpStatus.OK)
                .message("Forms fetched.")
                .forms(forms)
                .build();

        return new ResponseEntity<FormResponse>(response, response.getStatus());
    }

    @PostMapping("forms")
    public ResponseEntity<FormResponse> createForm(@RequestBody Form form) {
        Boolean created = formService.createForm(form);

        FormResponse response = FormResponse.builder()
                .status(HttpStatus.CREATED)
                .message("Form created.")
                .forms(Arrays.asList(form))
                .build();

        if (!created) {
            response.setMessage("Form not created.");
            response.setStatus(HttpStatus.NOT_FOUND);
            response.setForms(null);
        }

        return new ResponseEntity<FormResponse>(response, response.getStatus());
    }

    @PutMapping("forms")
    public ResponseEntity<FormResponse> updateForm(@RequestBody Form form) {
        Boolean updated = formService.updateForm(form);

        FormResponse response = FormResponse.builder()
                .status(HttpStatus.OK)
                .message("Form updated.")
                .forms(Arrays.asList(form))
                .build();

        if (!updated) {
            response.setMessage("Form not updated.");
            response.setStatus(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<FormResponse>(response, response.getStatus());
    }

    @DeleteMapping("forms")
    public ResponseEntity<FormResponse> deleteForm(@RequestParam int formId) {
        Boolean deleted = formService.deleteById(formId);

        FormResponse response = FormResponse.builder()
                .status(HttpStatus.OK)
                .message("Form deleted.")
                .forms(null)
                .build();

        if (!deleted) {
            response.setMessage("Form not deleted.");
            response.setStatus(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<FormResponse>(response, response.getStatus());
    }

}
