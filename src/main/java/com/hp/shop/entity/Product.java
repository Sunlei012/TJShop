package com.hp.shop.entity;


public class Product {

  private long pId;
  private String pName;
  private String subTitle;
  private double ariginalPrice;
  private double promotePrice;
  private long stock;
  private long cId;


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
  }


  public String getPName() {
    return pName;
  }

  public void setPName(String pName) {
    this.pName = pName;
  }


  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public double getAriginalPrice() {
    return ariginalPrice;
  }

  public void setAriginalPrice(double ariginalPrice) {
    this.ariginalPrice = ariginalPrice;
  }


  public double getPromotePrice() {
    return promotePrice;
  }

  public void setPromotePrice(double promotePrice) {
    this.promotePrice = promotePrice;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }

}
