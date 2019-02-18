package com.hp.shop.entity;


public class Cart {

  private long caId;
  private long pId;
  private long uId;
  private long caNumber;
  private java.sql.Timestamp caTime;


  public long getCaId() {
    return caId;
  }

  public void setCaId(long caId) {
    this.caId = caId;
  }


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getCaNumber() {
    return caNumber;
  }

  public void setCaNumber(long caNumber) {
    this.caNumber = caNumber;
  }


  public java.sql.Timestamp getCaTime() {
    return caTime;
  }

  public void setCaTime(java.sql.Timestamp caTime) {
    this.caTime = caTime;
  }

}
