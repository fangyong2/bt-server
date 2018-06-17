package com.csair.model;

import java.util.Date;

public class Tb {
    private Integer id;

    private String phonecode;

    private String endoncode;

    private Integer durationofcall;

    private Float telephoneexpenses;

    private Float preference;

    private String basestation;

    private String typeofservice;

    private Date startime;

    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(String phonecode) {
        this.phonecode = phonecode == null ? null : phonecode.trim();
    }

    public String getEndoncode() {
        return endoncode;
    }

    public void setEndoncode(String endoncode) {
        this.endoncode = endoncode == null ? null : endoncode.trim();
    }

    public Integer getDurationofcall() {
        return durationofcall;
    }

    public void setDurationofcall(Integer durationofcall) {
        this.durationofcall = durationofcall;
    }

    public Float getTelephoneexpenses() {
        return telephoneexpenses;
    }

    public void setTelephoneexpenses(Float telephoneexpenses) {
        this.telephoneexpenses = telephoneexpenses;
    }

    public Float getPreference() {
        return preference;
    }

    public void setPreference(Float preference) {
        this.preference = preference;
    }

    public String getBasestation() {
        return basestation;
    }

    public void setBasestation(String basestation) {
        this.basestation = basestation == null ? null : basestation.trim();
    }

    public String getTypeofservice() {
        return typeofservice;
    }

    public void setTypeofservice(String typeofservice) {
        this.typeofservice = typeofservice == null ? null : typeofservice.trim();
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}