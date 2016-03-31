/*
 * Department.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Department {

    private Integer departmentid;
    private String aliveflag;
    private String deptcode;
    private String deptname;
    private String flag;
    private String flag1;
    private String flag2;
    private String flag3;
    private String level;
    private String parentdeptcode;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;

    public Integer getDepartmentid() {
        return departmentid;
    }
    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }
    public String getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(String aliveflag) {
        this.aliveflag = aliveflag == null ? null : aliveflag.trim();
    }
    public String getDeptcode() {
        return deptcode;
    }
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }
    public String getDeptname() {
        return deptname;
    }
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
    public String getFlag1() {
        return flag1;
    }
    public void setFlag1(String flag1) {
        this.flag1 = flag1 == null ? null : flag1.trim();
    }
    public String getFlag2() {
        return flag2;
    }
    public void setFlag2(String flag2) {
        this.flag2 = flag2 == null ? null : flag2.trim();
    }
    public String getFlag3() {
        return flag3;
    }
    public void setFlag3(String flag3) {
        this.flag3 = flag3 == null ? null : flag3.trim();
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }
    public String getParentdeptcode() {
        return parentdeptcode;
    }
    public void setParentdeptcode(String parentdeptcode) {
        this.parentdeptcode = parentdeptcode == null ? null : parentdeptcode.trim();
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
    public String getRemark1() {
        return remark1;
    }
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
    public String getRemark2() {
        return remark2;
    }
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
    public String getRemark3() {
        return remark3;
    }
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
    public String getRemark4() {
        return remark4;
    }
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }
}