/*
 * ContractModel.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class ContractModel {

    private Integer contractmodelid;
    private Boolean aliveflag;
    private Date begindate;
    private Date enddate;
    private String modelno;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;

    public Integer getContractmodelid() {
        return contractmodelid;
    }
    public void setContractmodelid(Integer contractmodelid) {
        this.contractmodelid = contractmodelid;
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