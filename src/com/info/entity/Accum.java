/*
 * Accum.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Accum {

    private Integer accumid;
    private Double accumcom;
    private String accumno;
    private Double accumper;
    private Boolean aliveflag;
    private Double base;
    private Date begindate;
    private Date enddate;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;
    private String staffid;

    public Integer getAccumid() {
        return accumid;
    }
    public void setAccumid(Integer accumid) {
        this.accumid = accumid;
    }
    public Double getAccumcom() {
        return accumcom;
    }
    public void setAccumcom(Double accumcom) {
        this.accumcom = accumcom;
    }
    public String getAccumno() {
        return accumno;
    }
    public void setAccumno(String accumno) {
        this.accumno = accumno == null ? null : accumno.trim();
    }
    public Double getAccumper() {
        return accumper;
    }
    public void setAccumper(Double accumper) {
        this.accumper = accumper;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Date getBegindate() {
        return begindate;
    }
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }
    public Date getEnddate() {
        return enddate;
    }
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public Date getReccretm() {
        return reccretm;
    }
    public void setReccretm(Date reccretm) {
        this.reccretm = reccretm;
    }
    public String getReccreusrid() {
        return reccreusrid;
    }
    public void setReccreusrid(String reccreusrid) {
        this.reccreusrid = reccreusrid == null ? null : reccreusrid.trim();
    }
    public Date getRecupdttm() {
        return recupdttm;
    }
    public void setRecupdttm(Date recupdttm) {
        this.recupdttm = recupdttm;
    }
    public String getRecupdtusrid() {
        return recupdtusrid;
    }
    public void setRecupdtusrid(String recupdtusrid) {
        this.recupdtusrid = recupdtusrid == null ? null : recupdtusrid.trim();
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    public String getStaffid() {
        return staffid;
    }
    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }
}