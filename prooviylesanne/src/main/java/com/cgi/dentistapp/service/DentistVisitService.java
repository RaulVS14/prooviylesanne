package com.cgi.dentistapp.service;

import com.cgi.dentistapp.dao.DentistVisitDao;
import com.cgi.dentistapp.dao.entity.DentistVisitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DentistVisitService {

    @Autowired
    private DentistVisitDao dentistVisitDao;

    public void addVisit(String dentistName, Date visitTime, String primaryCarePhysicianName) {
        DentistVisitEntity visit = new DentistVisitEntity(dentistName, visitTime, primaryCarePhysicianName);
        dentistVisitDao.create(visit);
    }

    public List<DentistVisitEntity> listVisits() {
        return dentistVisitDao.getAllVisits();
    }

}
