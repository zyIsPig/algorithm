package com.example.algorithm.domain;


public class Order {

  private long orderId;
  private String orderNo;
  private long userId;
  private long totalPrice;
  private long payStatus;
  private long payType;
  private java.sql.Timestamp payTime;
  private long orderStatus;
  private String extraInfo;
  private String userName;
  private String userPhone;
  private long isDeleted;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(long totalPrice) {
    this.totalPrice = totalPrice;
  }


  public long getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(long payStatus) {
    this.payStatus = payStatus;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public java.sql.Timestamp getPayTime() {
    return payTime;
  }

  public void setPayTime(java.sql.Timestamp payTime) {
    this.payTime = payTime;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
