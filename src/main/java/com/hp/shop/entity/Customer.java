package com.hp.shop.entity;


public class Customer {

  private String cId;
  private String cMobile;
  private String cPassword;
  private String realName;
  private java.sql.Date birthday;
  private String address1;
  private String address2;
  private String address3;
  private String email;
  private double point;
  private String status;
  private java.sql.Timestamp cCreateDate;


  public String getCId() {
    return cId;
  }

  public void setCId(String cId) {
    this.cId = cId;
  }


  public String getCMobile() {
    return cMobile;
  }

  public void setCMobile(String cMobile) {
    this.cMobile = cMobile;
  }


  public String getCPassword() {
    return cPassword;
  }

  public void setCPassword(String cPassword) {
    this.cPassword = cPassword;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public double getPoint() {
    return point;
  }

  public void setPoint(double point) {
    this.point = point;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public java.sql.Timestamp getCCreateDate() {
    return cCreateDate;
  }

  public void setCCreateDate(java.sql.Timestamp cCreateDate) {
    this.cCreateDate = cCreateDate;
  }

}
