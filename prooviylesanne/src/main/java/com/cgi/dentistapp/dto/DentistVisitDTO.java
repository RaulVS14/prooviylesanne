package com.cgi.dentistapp.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by serkp on 2.03.2017.
 */
public class DentistVisitDTO {

    @Size(min = 1, max = 50)
    String dentistName;

    @NotNull
    String primaryCarePhysicianName;

    @NotNull
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    Date visitTime;

    public DentistVisitDTO() {
    }

    public DentistVisitDTO(String dentistName, Date visitTime,String primaryCarePhysicianName) {
        this.dentistName = dentistName;
        this.visitTime = visitTime;
        this.primaryCarePhysicianName = primaryCarePhysicianName;
    }


    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getPrimaryCarePhysicianName() {
        return primaryCarePhysicianName;
    }

    public void setPrimaryCarePhysicianName(String primaryCarePhysicianName) {
        this.primaryCarePhysicianName = primaryCarePhysicianName;
    }
}
