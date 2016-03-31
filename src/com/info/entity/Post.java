/*
 * Post.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Post {

    private Integer postid;
    private Boolean aliveflag;
    private String major;
    private String postcode;
    private String postlayer;
    private String postmulti;
    private String postname;
    private Float postnumber;
    private Float postnumberlow;
    private Float postnumberupper;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;
    private String worktype;

    public Integer getPostid() {
        return postid;
    }
    public void setPostid(Integer postid) {
        this.postid = postid;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
    public String getPostlayer() {
        return postlayer;
    }
    public void setPostlayer(String postlayer) {
        this.postlayer = postlayer == null ? null : postlayer.trim();
    }
    public String getPostmulti() {
        return postmulti;
    }
    public void setPostmulti(String postmulti) {
        this.postmulti = postmulti == null ? null : postmulti.trim();
    }
    public String getPostname() {
        return postname;
    }
    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }
    public Float getPostnumber() {
        return postnumber;
    }
    public void setPostnumber(Float postnumber) {
        this.postnumber = postnumber;
    }
    public Float getPostnumberlow() {
        return postnumberlow;
    }
    public void setPostnumberlow(Float postnumberlow) {
        this.postnumberlow = postnumberlow;
    }
    public Float getPostnumberupper() {
        return postnumberupper;
    }
    public void setPostnumberupper(Float postnumberupper) {
        this.postnumberupper = postnumberupper;
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
    public String getWorktype() {
        return worktype;
    }
    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }
}