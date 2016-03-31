/*
 * Leave.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Leave {

    private Integer leaveid;
    private Boolean aliveflag;
    private Double comfee;
    private String deptcode;
    private Date leaveapplydate;
    private Date leavedate;
    private String leavestatus;
    private String leavetype;
    private String onofftype;
    private Double perfee;
    private String positioncode;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private Date recorddate;
    private String remark;
    private String staffid;

    public Integer getLeaveid() {
        return leaveid;
    }
    public void setLeaveid(Integer leaveid) {
        this.leaveid = leaveid;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public Double getComfee() {
        return comfee;
    }
    public void setComfee(Double comfee) {
        this.comfee = comfee;
    }
    public String getDeptcode() {
        return deptcode;
    }
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }
    public Date getLeaveapplydate() {
        return leaveapplydate;
    }
    public void setLeaveapplydate(Date leaveapplydate) {
        this.leaveapplydate = leaveapplydate;
    }
    public Date getLeavedate() {
        return leavedate;
    }
    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }
    public String getLeavestatus() {
        return leavestatus;
    }
    public void setLeavestatus(String leavestatus) {
        this.leavestatus = leavestatus == null ? null : leavestatus.trim();
    }
    public String getLeavetype() {
        return leavetype;
    }
    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype == null ? null : leavetype.trim();
    }
    public String getOnofftype() {
        return onofftype;
    }
    public void setOnofftype(String onofftype) {
        this.onofftype = onofftype == null ? null : onofftype.trim();
    }
    public Double getPerfee() {
        return perfee;
    }
    public void setPerfee(Double perfee) {
        this.perfee = perfee;
    }
    public String getPositioncode() {
        return positioncode;
    }
    public void setPositioncode(String positioncode) {
        this.positioncode = positioncode == null ? null : positioncode.trim();
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
    public Date getRecorddate() {
        return recorddate;
    }
    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
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