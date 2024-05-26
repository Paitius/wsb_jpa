package com.capgemini.wsb.service;

import com.capgemini.wsb.WsbJpaApplication;
import com.capgemini.wsb.dto.*;
import com.capgemini.wsb.service.impl.PatientServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WsbJpaApplication.class)
@Transactional
public class PatientServiceImplTest {

    @Autowired
    private PatientServiceImpl patientService;


    @Transactional
    @Test
    public void findById() {
        PatientTO patientTO = patientService.findById(1L);

        assertEquals("John", patientTO.getFirstName());
        assertEquals("Doe", patientTO.getLastName());
    }
    @Transactional
    @Test
    public void addPatient() {
        // given
        PatientTO patientTO = new PatientTO();
        patientTO.setFirstName("Kamil");
        patientTO.setLastName("Gie");
        patientTO.setTelephoneNumber("123456789");
        patientTO.setEmail("kg@example.com");
        patientTO.setPatientNumber("P040");
        patientTO.setHeight(180);
        patientTO.setWeight(80);

        // when
        PatientTO savedPatientTO = patientService.save(patientTO);

        // then
        assertNotNull(savedPatientTO.getId());
        assertEquals(patientTO.getFirstName(), savedPatientTO.getFirstName());
        assertEquals(patientTO.getLastName(), savedPatientTO.getLastName());
    }
    @Transactional
    @Test
    public void removePatient() {
        // given
        PatientTO patientTO = new PatientTO();
        patientTO.setFirstName("Kamil");
        patientTO.setLastName("Gie");
        patientTO.setTelephoneNumber("123456789");
        patientTO.setEmail("kg@example.com");
        patientTO.setPatientNumber("P040");
        patientTO.setHeight(180);
        patientTO.setWeight(80);

        PatientTO savedPatientTO = patientService.save(patientTO);
        Long patientId = savedPatientTO.getId();

        // when
        patientService.delete(patientId);

        // then
        assertNull(patientService.findById(patientId));
    }


    @Transactional
    @Test
    public void testGetAllVisitsByPatientID() {
        // given
        Long patientId = 1L;

        // when
        List<VisitTO> visits = patientService.getAllVisitsForPatient(patientId);

        // then
        assertNotNull(visits);
        assertEquals(patientService.findById(patientId).getVisits().size(), visits.size());
        assertEquals(patientId, visits.get(0).getPatient().getId());
    }

}