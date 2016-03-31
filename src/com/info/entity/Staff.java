/*
 * Staff.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-31 Created
 */
package com.info.entity;

import java.util.Date;

public class Staff {

    private Integer id;
    private Date partydate;
    private Boolean accumeflag;
    private String address;
    private Float age;
    private Boolean aliveflag;
    private String appjobno;
    private Date beginworkdate;
    private String birthplace;
    private String birthday;
    private Date birthdayluna;
    private String blood;
    private String college;
    private String collegetype;
    private String country;
    private String currcollege;
    private String currdegree;
    private Date currdegreedate;
    private String curreducation;
    private Date currgraduatedate;
    private String currmajor;
    private String degree;
    private String degreedate;
    private String deptcode;
    private String education;
    private String email;
    private String empway;
    private Date entrancedate;
    private String flag1;
    private String flag2;
    private String flag3;
    private Date graduatedate;
    private String grantcountry;
    private String grantdept;
    private String guarant;
    private String health;
    private String hobby;
    private String idcardno;
    private String insuretype;
    private Boolean insureiflag;
    private Boolean insuremflag;
    private Boolean insurepflag;
    private Boolean keyflag;
    private String language;
    private String languagelevel;
    private String major;
    private String marriage;
    private String mobiletel;
    private String nation;
    private String nativ;
    private String origin;
    private String party;
    private String positioncode;
    private String postmulti;
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
    private Date servicedate;
    private String serviceyear;
    private String sex;
    private String skilldate;
    private String skilllevel;
    private String socialcardid;
    private Date specialdate;
    private String specialskill;
    private String specialtitle;
    private String staffid;
    private String staffidold;
    private String staffname;
    private String state;
    private String telshort;
    private String telephone;
    private String title;
    private String titledate;
    private String urgentaddress1;
    private String urgentaddress2;
    private String urgentaddress3;
    private String urgentname1;
    private String urgentname2;
    private String urgentname3;
    private String urgentrelate1;
    private String urgentrelate2;
    private String urgentrelate3;
    private String urgenttel1;
    private String urgenttel2;
    private String urgenttel3;
    private Date workindate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getPartydate() {
        return partydate;
    }
    public void setPartydate(Date partydate) {
        this.partydate = partydate;
    }
    public Boolean getAccumeflag() {
        return accumeflag;
    }
    public void setAccumeflag(Boolean accumeflag) {
        this.accumeflag = accumeflag;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public Float getAge() {
        return age;
    }
    public void setAge(Float age) {
        this.age = age;
    }
    public Boolean getAliveflag() {
        return aliveflag;
    }
    public void setAliveflag(Boolean aliveflag) {
        this.aliveflag = aliveflag;
    }
    public String getAppjobno() {
        return appjobno;
    }
    public void setAppjobno(String appjobno) {
        this.appjobno = appjobno == null ? null : appjobno.trim();
    }
    public Date getBeginworkdate() {
        return beginworkdate;
    }
    public void setBeginworkdate(Date beginworkdate) {
        this.beginworkdate = beginworkdate;
    }
    public String getBirthplace() {
        return birthplace;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }
    public Date getBirthdayluna() {
        return birthdayluna;
    }
    public void setBirthdayluna(Date birthdayluna) {
        this.birthdayluna = birthdayluna;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }
    public String getCurrcollege() {
        return currcollege;
    }
    public void setCurrcollege(String currcollege) {
        this.currcollege = currcollege == null ? null : currcollege.trim();
    }
    public String getCurrdegree() {
        return currdegree;
    }
    public void setCurrdegree(String currdegree) {
        this.currdegree = currdegree == null ? null : currdegree.trim();
    }
    public Date getCurrdegreedate() {
        return currdegreedate;
    }
    public void setCurrdegreedate(Date currdegreedate) {
        this.currdegreedate = currdegreedate;
    }
    public String getCurreducation() {
        return curreducation;
    }
    public void setCurreducation(String curreducation) {
        this.curreducation = curreducation == null ? null : curreducation.trim();
    }
    public Date getCurrgraduatedate() {
        return currgraduatedate;
    }
    public void setCurrgraduatedate(Date currgraduatedate) {
        this.currgraduatedate = currgraduatedate;
    }
    public String getCurrmajor() {
        return currmajor;
    }
    public void setCurrmajor(String currmajor) {
        this.currmajor = currmajor == null ? null : currmajor.trim();
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }
    public String getDegreedate() {
        return degreedate;
    }
    public void setDegreedate(String degreedate) {
        this.degreedate = degreedate == null ? null : degreedate.trim();
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
    public String getEmpway() {
        return empway;
    }
    public void setEmpway(String empway) {
        this.empway = empway == null ? null : empway.trim();
    }
    public Date getEntrancedate() {
        return entrancedate;
    }
    public void setEntrancedate(Date entrancedate) {
        this.entrancedate = entrancedate;
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
    public Date getGraduatedate() {
        return graduatedate;
    }
    public void setGraduatedate(Date graduatedate) {
        this.graduatedate = graduatedate;
    }
    public String getGrantcountry() {
        return grantcountry;
    }
    public void setGrantcountry(String grantcountry) {
        this.grantcountry = grantcountry == null ? null : grantcountry.trim();
    }
    public String getGrantdept() {
        return grantdept;
    }
    public void setGrantdept(String grantdept) {
        this.grantdept = grantdept == null ? null : grantdept.trim();
    }
    public String getGuarant() {
        return guarant;
    }
    public void setGuarant(String guarant) {
        this.guarant = guarant == null ? null : guarant.trim();
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
    public String getInsuretype() {
        return insuretype;
    }
    public void setInsuretype(String insuretype) {
        this.insuretype = insuretype == null ? null : insuretype.trim();
    }
    public Boolean getInsureiflag() {
        return insureiflag;
    }
    public void setInsureiflag(Boolean insureiflag) {
        this.insureiflag = insureiflag;
    }
    public Boolean getInsuremflag() {
        return insuremflag;
    }
    public void setInsuremflag(Boolean insuremflag) {
        this.insuremflag = insuremflag;
    }
    public Boolean getInsurepflag() {
        return insurepflag;
    }
    public void setInsurepflag(Boolean insurepflag) {
        this.insurepflag = insurepflag;
    }
    public Boolean getKeyflag() {
        return keyflag;
    }
    public void setKeyflag(Boolean keyflag) {
        this.keyflag = keyflag;
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
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
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
    public String getPositioncode() {
        return positioncode;
    }
    public void setPositioncode(String positioncode) {
        this.positioncode = positioncode == null ? null : positioncode.trim();
    }
    public String getPostmulti() {
        return postmulti;
    }
    public void setPostmulti(String postmulti) {
        this.postmulti = postmulti == null ? null : postmulti.trim();
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
    public Date getServicedate() {
        return servicedate;
    }
    public void setServicedate(Date servicedate) {
        this.servicedate = servicedate;
    }
    public String getServiceyear() {
        return serviceyear;
    }
    public void setServiceyear(String serviceyear) {
        this.serviceyear = serviceyear == null ? null : serviceyear.trim();
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
    public String getSkilldate() {
        return skilldate;
    }
    public void setSkilldate(String skilldate) {
        this.skilldate = skilldate == null ? null : skilldate.trim();
    }
    public String getSkilllevel() {
        return skilllevel;
    }
    public void setSkilllevel(String skilllevel) {
        this.skilllevel = skilllevel == null ? null : skilllevel.trim();
    }
    public String getSocialcardid() {
        return socialcardid;
    }
    public void setSocialcardid(String socialcardid) {
        this.socialcardid = socialcardid == null ? null : socialcardid.trim();
    }
    public Date getSpecialdate() {
        return specialdate;
    }
    public void setSpecialdate(Date specialdate) {
        this.specialdate = specialdate;
    }
    public String getSpecialskill() {
        return specialskill;
    }
    public void setSpecialskill(String specialskill) {
        this.specialskill = specialskill == null ? null : specialskill.trim();
    }
    public String getSpecialtitle() {
        return specialtitle;
    }
    public void setSpecialtitle(String specialtitle) {
        this.specialtitle = specialtitle == null ? null : specialtitle.trim();
    }
    public String getStaffid() {
        return staffid;
    }
    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }
    public String getStaffidold() {
        return staffidold;
    }
    public void setStaffidold(String staffidold) {
        this.staffidold = staffidold == null ? null : staffidold.trim();
    }
    public String getStaffname() {
        return staffname;
    }
    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
    public String getTelshort() {
        return telshort;
    }
    public void setTelshort(String telshort) {
        this.telshort = telshort == null ? null : telshort.trim();
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
    public String getUrgentaddress1() {
        return urgentaddress1;
    }
    public void setUrgentaddress1(String urgentaddress1) {
        this.urgentaddress1 = urgentaddress1 == null ? null : urgentaddress1.trim();
    }
    public String getUrgentaddress2() {
        return urgentaddress2;
    }
    public void setUrgentaddress2(String urgentaddress2) {
        this.urgentaddress2 = urgentaddress2 == null ? null : urgentaddress2.trim();
    }
    public String getUrgentaddress3() {
        return urgentaddress3;
    }
    public void setUrgentaddress3(String urgentaddress3) {
        this.urgentaddress3 = urgentaddress3 == null ? null : urgentaddress3.trim();
    }
    public String getUrgentname1() {
        return urgentname1;
    }
    public void setUrgentname1(String urgentname1) {
        this.urgentname1 = urgentname1 == null ? null : urgentname1.trim();
    }
    public String getUrgentname2() {
        return urgentname2;
    }
    public void setUrgentname2(String urgentname2) {
        this.urgentname2 = urgentname2 == null ? null : urgentname2.trim();
    }
    public String getUrgentname3() {
        return urgentname3;
    }
    public void setUrgentname3(String urgentname3) {
        this.urgentname3 = urgentname3 == null ? null : urgentname3.trim();
    }
    public String getUrgentrelate1() {
        return urgentrelate1;
    }
    public void setUrgentrelate1(String urgentrelate1) {
        this.urgentrelate1 = urgentrelate1 == null ? null : urgentrelate1.trim();
    }
    public String getUrgentrelate2() {
        return urgentrelate2;
    }
    public void setUrgentrelate2(String urgentrelate2) {
        this.urgentrelate2 = urgentrelate2 == null ? null : urgentrelate2.trim();
    }
    public String getUrgentrelate3() {
        return urgentrelate3;
    }
    public void setUrgentrelate3(String urgentrelate3) {
        this.urgentrelate3 = urgentrelate3 == null ? null : urgentrelate3.trim();
    }
    public String getUrgenttel1() {
        return urgenttel1;
    }
    public void setUrgenttel1(String urgenttel1) {
        this.urgenttel1 = urgenttel1 == null ? null : urgenttel1.trim();
    }
    public String getUrgenttel2() {
        return urgenttel2;
    }
    public void setUrgenttel2(String urgenttel2) {
        this.urgenttel2 = urgenttel2 == null ? null : urgenttel2.trim();
    }
    public String getUrgenttel3() {
        return urgenttel3;
    }
    public void setUrgenttel3(String urgenttel3) {
        this.urgenttel3 = urgenttel3 == null ? null : urgenttel3.trim();
    }
    public Date getWorkindate() {
        return workindate;
    }
    public void setWorkindate(Date workindate) {
        this.workindate = workindate;
    }
}