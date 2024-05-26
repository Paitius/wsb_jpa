package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface VisitService {
    VisitTO findById(Long id);
    VisitTO save(VisitTO visit);
    void delete(Long id);
}