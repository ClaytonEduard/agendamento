package com.nathaliapf.scheduling;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;
    @Column(nullable = false, length =255)
    private String description;
    @Column(nullable = false)
    private Date hourFisrtDate;
    @Column(nullable = false)
    private Date hourEndDate;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getHourFisrtDate() {
        return hourFisrtDate;
    }
    public void setHourFisrtDate(Date hourFisrtDate) {
        this.hourFisrtDate = hourFisrtDate;
    }
    public Date getHourEndDate() {
        return hourEndDate;
    }
    public void setHourEndDate(Date hourEndDate) {
        this.hourEndDate = hourEndDate;
    }
      
    
}
