package com.hp.shop.entity;


public class Orderitem {

  private long orId;
  private long pId;
  private long oId;
  private long uId;
  private long number;
  private String payWay;
  private double amount;


  public long getOrId() {
    return orId;
  }

  public void setOrId(long orId) {
    this.orId = orId;
  }


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
  }


  public long getOId() {
    return oId;
  }

  public void setOId(long oId) {
    this.oId = oId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public String getPayWay() {
    return payWay;
  }

  public void setPayWay(String payWay) {
    this.payWay = payWay;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

}
