package com.hp.shop.entity;


public class Order {

  private long oId;
  private String address__Address;
  private String post;
  private long reId;
  private String userMessage;
  private java.sql.Timestamp oCreateDate;
  private java.sql.Timestamp payDate;
  private java.sql.Timestamp deliveryDate;
  private java.sql.Timestamp comfirmDate;
  private long cId;
  private String status;
  private long rId;
  private long number;
  private double amount;


  public long getOId() {
    return oId;
  }

  public void setOId(long oId) {
    this.oId = oId;
  }


  public String getAddress__Address() {
    return address__Address;
  }

  public void setAddress__Address(String address__Address) {
    this.address__Address = address__Address;
  }


  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }


  public long getReId() {
    return reId;
  }

  public void setReId(long reId) {
    this.reId = reId;
  }


  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }


  public java.sql.Timestamp getOCreateDate() {
    return oCreateDate;
  }

  public void setOCreateDate(java.sql.Timestamp oCreateDate) {
    this.oCreateDate = oCreateDate;
  }


  public java.sql.Timestamp getPayDate() {
    return payDate;
  }

  public void setPayDate(java.sql.Timestamp payDate) {
    this.payDate = payDate;
  }


  public java.sql.Timestamp getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(java.sql.Timestamp deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public java.sql.Timestamp getComfirmDate() {
    return comfirmDate;
  }

  public void setComfirmDate(java.sql.Timestamp comfirmDate) {
    this.comfirmDate = comfirmDate;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getRId() {
    return rId;
  }

  public void setRId(long rId) {
    this.rId = rId;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

}
