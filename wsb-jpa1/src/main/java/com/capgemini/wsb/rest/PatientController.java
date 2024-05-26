package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PatientController {

    private final PatientService patientService;



    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patient/{id}")
    PatientTO findPatientById(@PathVariable final Long id){
        final PatientTO patientTO = patientService.findById(id);
        if (patientTO != null) {
            return patientTO;
        }
        throw new EntityNotFoundException(id);
    }

}
