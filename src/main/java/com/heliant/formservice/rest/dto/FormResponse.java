package com.heliant.formservice.rest.dto;

import com.heliant.formservice.domain.Form;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@Builder
public class FormResponse {

    private HttpStatus status;

    private String message;

    private List<Form> forms;

}
