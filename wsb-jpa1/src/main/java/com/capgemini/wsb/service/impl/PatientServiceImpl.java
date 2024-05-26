package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.dao.VisitDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;

    }


    @Override
    public PatientTO findById(Long id) {
        PatientEntity entity = patientDao.findOne(id);
        return PatientMapper.mapToTO(entity);
    }

    @Override
    public PatientTO save(PatientTO patient) {
        PatientEntity entity = PatientMapper.mapToEntity(patient);
        PatientEntity savedEntity = patientDao.save(entity);
        return PatientMapper.mapToTO(savedEntity);
    }

    @Override
    public void delete(Long id) {
        patientDao.delete(id);
    }

    @Override
    public List<VisitTO> getAllVisitsForPatient(Long patientId) {
        PatientEntity patientEntity = patientDao.findOne(patientId);
        List<VisitEntity> visitEntities = (List<VisitEntity>) patientEntity.getVisitEntities();
        return visitEntities.stream()
                .map(VisitMapper::mapToTO)
                .collect(Collectors.toList());
    }


}