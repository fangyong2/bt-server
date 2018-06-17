package com.csair.model;

public class Tp {
    private Integer id;

    private String basestation;

    private Integer trafficCurrent;

    private Integer traffic1h;

    private Integer traffic2h;

    private Integer traffic3h;

    private Integer traffic4h;

    private Integer traffic5h;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasestation() {
        return basestation;
    }

    public void setBasestation(String basestation) {
        this.basestation = basestation == null ? null : basestation.trim();
    }

    public Integer getTrafficCurrent() {
        return trafficCurrent;
    }

    public void setTrafficCurrent(Integer trafficCurrent) {
        this.trafficCurrent = trafficCurrent;
    }

    public Integer getTraffic1h() {
        return traffic1h;
    }

    public void setTraffic1h(Integer traffic1h) {
        this.traffic1h = traffic1h;
    }

    public Integer getTraffic2h() {
        return traffic2h;
    }

    public void setTraffic2h(Integer traffic2h) {
        this.traffic2h = traffic2h;
    }

    public Integer getTraffic3h() {
        return traffic3h;
    }

    public void setTraffic3h(Integer traffic3h) {
        this.traffic3h = traffic3h;
    }

    public Integer getTraffic4h() {
        return traffic4h;
    }

    public void setTraffic4h(Integer traffic4h) {
        this.traffic4h = traffic4h;
    }

    public Integer getTraffic5h() {
        return traffic5h;
    }

    public void setTraffic5h(Integer traffic5h) {
        this.traffic5h = traffic5h;
    }
}