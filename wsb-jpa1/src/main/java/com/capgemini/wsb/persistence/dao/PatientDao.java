package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;

import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PatientDao extends Dao<PatientEntity, Long>{

    List<PatientEntity> findByLastName(String pLastName);

    List<PatientEntity> findPatientsWithMoreVisitsThen(int pVisitNumber);

    List <PatientEntity> findWhereWeightMoreThen(int pWeight);

}