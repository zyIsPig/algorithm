package com.example.algorithm.domain;



public class Buyer {

  private long buyerId;
  private String nickName;
  private String loginName;
  private String passwordMd5;
  private String introduceSign;
  private java.sql.Timestamp createTime;


  public long getBuyerId() {
    return buyerId;
  }

  public void setBuyerId(long buyerId) {
    this.buyerId = buyerId;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public String getPasswordMd5() {
    return passwordMd5;
  }

  public void setPasswordMd5(String passwordMd5) {
    this.passwordMd5 = passwordMd5;
  }


  public String getIntroduceSign() {
    return introduceSign;
  }

  public void setIntroduceSign(String introduceSign) {
    this.introduceSign = introduceSign;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
