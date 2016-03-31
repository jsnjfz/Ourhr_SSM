/*
 * TransferOrder.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class TransferOrder {

    private Integer transferorderid;
    private Boolean aliveflag;
    private Date dutydate;
    private Date indate;
    private String indepcode;
    private String inpositioncode;
    private Date movdate;
    private String movstatus;
    private Date outdate;
    private String outdepcode;
    private String outpositioncode;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;
    private String staffid;

    public Integer getTransferorderid() {
        return transferorderid;
    }
    public void setTransferorderid(Integer transferorderid) {
        this.transferorderid = transferorderid;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public Date getDutydate() {
        return dutydate;
    }
    public void setDutydate(Date dutydate) {
        this.dutydate = dutydate;
    }
    public Date getIndate() {
        return indate;
    }
    public void setIndate(Date indate) {
        this.indate = indate;
    }
    public String getIndepcode() {
        return indepcode;
    }
    public void setIndepcode(String indepcode) {
        this.indepcode = indepcode == null ? null : indepcode.trim();
    }
    public String getInpositioncode() {
        return inpositioncode;
    }
    public void setInpositioncode(String inpositioncode) {
        this.inpositioncode = inpositioncode == null ? null : inpositioncode.trim();
    }
    public Date getMovdate() {
        return movdate;
    }
    public void setMovdate(Date movdate) {
        this.movdate = movdate;
    }
    public String getMovstatus() {
        return movstatus;
    }
    public void setMovstatus(String movstatus) {
        this.movstatus = movstatus == null ? null : movstatus.trim();
    }
    public Date getOutdate() {
        return outdate;
    }
    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }
    public String getOutdepcode() {
        return outdepcode;
    }
    public void setOutdepcode(String outdepcode) {
        this.outdepcode = outdepcode == null ? null : outdepcode.trim();
    }
    public String getOutpositioncode() {
        return outpositioncode;
    }
    public void setOutpositioncode(String outpositioncode) {
        this.outpositioncode = outpositioncode == null ? null : outpositioncode.trim();
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