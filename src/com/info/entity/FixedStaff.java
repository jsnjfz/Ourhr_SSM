/*
 * FixedStaff.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class FixedStaff {

    private Integer fixedstaffid;
    private Boolean aliveflag;
    private String departmentcode;
    private Integer fixednumber;
    private String fixedtype;
    private String postcode;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;

    public Integer getFixedstaffid() {
        return fixedstaffid;
    }
    public void setFixedstaffid(Integer fixedstaffid) {
        this.fixedstaffid = fixedstaffid;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public String getDepartmentcode() {
        return departmentcode;
    }
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
    }
    public Integer getFixednumber() {
        return fixednumber;
    }
    public void setFixednumber(Integer fixednumber) {
        this.fixednumber = fixednumber;
    }
    public String getFixedtype() {
        return fixedtype;
    }
    public void setFixedtype(String fixedtype) {
        this.fixedtype = fixedtype == null ? null : fixedtype.trim();
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
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
}