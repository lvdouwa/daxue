package com.lvdouwa.daxue.web.model;

public class Jbxx {
    private Integer uid;

    private String name;

    private String type;

    private String subjection;

    private Integer keydiscipline;

    private Integer academician;

    private Integer doctordegree;

    private Integer masterdegree;

    private String location;

    private String 985or211;

    private String address;

    private String telephone;

    private String web;

    private String profile;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSubjection() {
        return subjection;
    }

    public void setSubjection(String subjection) {
        this.subjection = subjection == null ? null : subjection.trim();
    }

    public Integer getKeydiscipline() {
        return keydiscipline;
    }

    public void setKeydiscipline(Integer keydiscipline) {
        this.keydiscipline = keydiscipline;
    }

    public Integer getAcademician() {
        return academician;
    }

    public void setAcademician(Integer academician) {
        this.academician = academician;
    }

    public Integer getDoctordegree() {
        return doctordegree;
    }

    public void setDoctordegree(Integer doctordegree) {
        this.doctordegree = doctordegree;
    }

    public Integer getMasterdegree() {
        return masterdegree;
    }

    public void setMasterdegree(Integer masterdegree) {
        this.masterdegree = masterdegree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String get985or211() {
        return 985or211;
    }

    public void set985or211(String 985or211) {
        this.985or211 = 985or211 == null ? null : 985or211.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }
}