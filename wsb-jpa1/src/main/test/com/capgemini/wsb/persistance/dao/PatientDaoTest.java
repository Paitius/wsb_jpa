package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Test
    public void testShouldFindPatientsWhereWeightMoreThen() {
        // given
        PatientEntity patient1 = new PatientEntity();
        patient1.setFirstName("John");
        patient1.setLastName("Doe");
        patient1.setWeight(70);

        PatientEntity patient2 = new PatientEntity();
        patient2.setFirstName("Jane");
        patient2.setLastName("Doe");
        patient2.setWeight(85);

        patientDao.save(patient1);
        patientDao.save(patient2);
        // when
        List<PatientEntity> results = patientDao.findWhereWeightMoreThen(75);
        // then
        assertEquals(1, results.size());
        assertEquals("Jane", results.get(0).getFirstName());
    }

    @Test
    public void testFindByLastName() {
        // when
        List<PatientEntity> patients = patientRepository.findByLastName("Lewandowski");

        // then
        assertThat(patients).isNotNull();
        assertThat(patients.size()).isEqualTo(1);
    }

}
