package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @Override
    public List<PatientEntity> findByLastName(String pLastName) {
        return entityManager.createQuery(" select patient from PatientEntity patient " +
                                            " where patient.lastName like :lastName ", PatientEntity.class)
                                            .setParameter("lastName", pLastName)
                                            .getResultList();
    }


    @Override
    public List<PatientEntity> findPatientsWithMoreVisitsThen(int pVisitNumber) {
        return entityManager.createQuery("select patient from PatientEntity patient " +
                " where size(patient.visitEntities) > :pVisitNumber", PatientEntity.class)
                .setParameter("pVisitNumber", pVisitNumber)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findWhereWeightMoreThen(int pWeight) {
        return entityManager.createQuery("select patient from PatientEntity patient "+
                " where patient.weight > :pWeight ", PatientEntity.class)
                .setParameter("pWeight", pWeight)
                .getResultList();

    }
}
