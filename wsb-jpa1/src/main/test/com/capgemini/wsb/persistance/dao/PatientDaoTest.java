package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {
    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testFindByLastName() {
        // given
        // when
        List<PatientEntity> patients = patientDao.findByLastName("White");
        // then
        assertThat(patients).isNotNull();
        assertThat((patients.size())).isEqualTo(1);

    }

    @Test
    public void testFindPatientsWithMoreVisitsThen() {
        //given
        // when
        List<PatientEntity> patients = patientDao.findPatientsWithMoreVisitsThen(2);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.size()).isEqualTo(1);
    }

    @Test
    public void testFindWhereWeightMoreThen() {
        //given
        // when
        List<PatientEntity> patients = patientDao.findWhereWeightMoreThen(80);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.size()).isEqualTo(5);
    }
}