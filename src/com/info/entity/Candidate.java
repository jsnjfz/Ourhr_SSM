/*
 * Candidate.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Candidate {

    private Integer candidateid;
    private String address;
    private Boolean aliveflag;
    private Integer appjobno;
    private String birthplace;
    private Date birthday;
    private String college;
    private String collegetype;
    private String degree;
    private Date degreedate;
    private String deptcode;
    private String education;
    private String email;
    private Integer empway;
    private String employstatus;
    private String formerworkplace;
    private Date graduatedate;
    private String guarantor;
    private String health;
    private String hobby;
    private String idcardno;
    private String language;
    private String languagelevel;
    private String major;
    private String marriage;
    private String mobiletel;
    private Integer nation;
    private String nativ;
    private String origin;
    private String party;
    private Date partydate;
    private Date reccretm;
    private String reccreusrid;
    private Date recupdttm;
    private String recupdtusrid;
    private String remark;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String remark6;
    private String remark7;
    private String remark8;
    private String remark9;
    private String sex;
    private String specialskill;
    private String staffid;
    private String staffname;
    private String telephone;
    private String title;
    private String titledate;
    private String zipcode;

    public Integer getCandidateid() {
        return candidateid;
    }
    public void setCandidateid(Integer candidateid) {
        this.candidateid = candidateid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public Integer getAppjobno() {
        return appjobno;
    }
    public void setAppjobno(Integer appjobno) {
        this.appjobno = appjobno;
    }
    public String getBirthplace() {
        return birthplace;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }
    public String getCollegetype() {
        return collegetype;
    }
    public void setCollegetype(String collegetype) {
        this.collegetype = collegetype == null ? null : collegetype.trim();
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }
    public Date getDegreedate() {
        return degreedate;
    }
    public void setDegreedate(Date degreedate) {
        this.degreedate = degreedate;
    }
    public String getDeptcode() {
        return deptcode;
    }
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public Integer getEmpway() {
        return empway;
    }
    public void setEmpway(Integer empway) {
        this.empway = empway;
    }
    public String getEmploystatus() {
        return employstatus;
    }
    public void setEmploystatus(String employstatus) {
        this.employstatus = employstatus == null ? null : employstatus.trim();
    }
    public String getFormerworkplace() {
        return formerworkplace;
    }
    public void setFormerworkplace(String formerworkplace) {
        this.formerworkplace = formerworkplace == null ? null : formerworkplace.trim();
    }
    public Date getGraduatedate() {
        return graduatedate;
    }
    public void setGraduatedate(Date graduatedate) {
        this.graduatedate = graduatedate;
    }
    public String getGuarantor() {
        return guarantor;
    }
    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor == null ? null : guarantor.trim();
    }
    public String getHealth() {
        return health;
    }
    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }
    public String getIdcardno() {
        return idcardno;
    }
    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
    public String getLanguagelevel() {
        return languagelevel;
    }
    public void setLanguagelevel(String languagelevel) {
        this.languagelevel = languagelevel == null ? null : languagelevel.trim();
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
    public String getMarriage() {
        return marriage;
    }
    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }
    public String getMobiletel() {
        return mobiletel;
    }
    public void setMobiletel(String mobiletel) {
        this.mobiletel = mobiletel == null ? null : mobiletel.trim();
    }
    public Integer getNation() {
        return nation;
    }
    public void setNation(Integer nation) {
        this.nation = nation;
    }
    public String getNativ() {
        return nativ;
    }
    public void setNativ(String nativ) {
        this.nativ = nativ == null ? null : nativ.trim();
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }
    public String getParty() {
        return party;
    }
    public void setParty(String party) {
        this.party = party == null ? null : party.trim();
    }
    public Date getPartydate() {
        return partydate;
    }
    public void setPartydate(Date partydate) {
        this.partydate = partydate;
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
    public String getRemark5() {
        return remark5;
    }
    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }
    public String getRemark6() {
        return remark6;
    }
    public void setRemark6(String remark6) {
        this.remark6 = remark6 == null ? null : remark6.trim();
    }
    public String getRemark7() {
        return remark7;
    }
    public void setRemark7(String remark7) {
        this.remark7 = remark7 == null ? null : remark7.trim();
    }
    public String getRemark8() {
        return remark8;
    }
    public void setRemark8(String remark8) {
        this.remark8 = remark8 == null ? null : remark8.trim();
    }
    public String getRemark9() {
        return remark9;
    }
    public void setRemark9(String remark9) {
        this.remark9 = remark9 == null ? null : remark9.trim();
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
    public String getSpecialskill() {
        return specialskill;
    }
    public void setSpecialskill(String specialskill) {
        this.specialskill = specialskill == null ? null : specialskill.trim();
    }
    public String getStaffid() {
        return staffid;
    }
    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }
    public String getStaffname() {
        return staffname;
    }
    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getTitledate() {
        return titledate;
    }
    public void setTitledate(String titledate) {
        this.titledate = titledate == null ? null : titledate.trim();
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }
}