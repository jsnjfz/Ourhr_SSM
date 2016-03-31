/*
 * PostSort.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class PostSort {

    private Integer postsortid;
    private Boolean aliveflag;
    private String level;
    private String postsortcode;
    private String postsortname;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;

    public Integer getPostsortid() {
        return postsortid;
    }
    public void setPostsortid(Integer postsortid) {
        this.postsortid = postsortid;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }
    public String getPostsortcode() {
        return postsortcode;
    }
    public void setPostsortcode(String postsortcode) {
        this.postsortcode = postsortcode == null ? null : postsortcode.trim();
    }
    public String getPostsortname() {
        return postsortname;
    }
    public void setPostsortname(String postsortname) {
        this.postsortname = postsortname == null ? null : postsortname.trim();
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
}