package com.hp.shop.entity;


public class Category {

  private long caId;
  private String caName;
  private long caParentId;
  private long caGradeNum;


  public long getCaId() {
    return caId;
  }

  public void setCaId(long caId) {
    this.caId = caId;
  }


  public String getCaName() {
    return caName;
  }

  public void setCaName(String caName) {
    this.caName = caName;
  }


  public long getCaParentId() {
    return caParentId;
  }

  public void setCaParentId(long caParentId) {
    this.caParentId = caParentId;
  }


  public long getCaGradeNum() {
    return caGradeNum;
  }

  public void setCaGradeNum(long caGradeNum) {
    this.caGradeNum = caGradeNum;
  }

}
