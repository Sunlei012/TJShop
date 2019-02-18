package com.hp.shop.entity;


public class Review {

  private long rId;
  private String content;
  private long uId;
  private long pId;
  private java.sql.Timestamp rCreateDate;


  public long getRId() {
    return rId;
  }

  public void setRId(long rId) {
    this.rId = rId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
  }


  public java.sql.Timestamp getRCreateDate() {
    return rCreateDate;
  }

  public void setRCreateDate(java.sql.Timestamp rCreateDate) {
    this.rCreateDate = rCreateDate;
  }

}
