/*
 * Contract.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Contract {

    private Integer id;
    private Boolean aliveflag;
    private Date begindate;
    private Double commoney;
    private String contractendexp;
    private String contractexp;
    private String contractid;
    private String contractstatus;
    private Double contracttimes;
    private String contracttype;
    private Date enddate;
    private String modelno;
    private String otherexplain;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;
    private String staffid;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public Date getBegindate() {
        return begindate;
    }
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }
    public Double getCommoney() {
        return commoney;
    }
    public void setCommoney(Double commoney) {
        this.commoney = commoney;
    }
    public String getContractendexp() {
        return contractendexp;
    }
    public void setContractendexp(String contractendexp) {
        this.contractendexp = contractendexp == null ? null : contractendexp.trim();
    }
    public String getContractexp() {
        return contractexp;
    }
    public void setContractexp(String contractexp) {
        this.contractexp = contractexp == null ? null : contractexp.trim();
    }
    public String getContractid() {
        return contractid;
    }
    public void setContractid(String contractid) {
        this.contractid = contractid == null ? null : contractid.trim();
    }
    public String getContractstatus() {
        return contractstatus;
    }
    public void setContractstatus(String contractstatus) {
        this.contractstatus = contractstatus == null ? null : contractstatus.trim();
    }
    public Double getContracttimes() {
        return contracttimes;
    }
    public void setContracttimes(Double contracttimes) {
        this.contracttimes = contracttimes;
    }
    public String getContracttype() {
        return contracttype;
    }
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }
    public Date getEnddate() {
        return enddate;
    }
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public String getModelno() {
        return modelno;
    }
    public void setModelno(String modelno) {
        this.modelno = modelno == null ? null : modelno.trim();
    }
    public String getOtherexplain() {
        return otherexplain;
    }
    public void setOtherexplain(String otherexplain) {
        this.otherexplain = otherexplain == null ? null : otherexplain.trim();
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