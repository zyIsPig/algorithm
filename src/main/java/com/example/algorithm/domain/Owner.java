package com.example.algorithm.domain;



public class Owner {

  private long ownerId;
  private String loginUserName;
  private String loginPassword;
  private String nickName;
  private java.sql.Timestamp createTime;
  private String introduceSign;


  public long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }


  public String getLoginUserName() {
    return loginUserName;
  }

  public void setLoginUserName(String loginUserName) {
    this.loginUserName = loginUserName;
  }


  public String getLoginPassword() {
    return loginPassword;
  }

  public void setLoginPassword(String loginPassword) {
    this.loginPassword = loginPassword;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getIntroduceSign() {
    return introduceSign;
  }

  public void setIntroduceSign(String introduceSign) {
    this.introduceSign = introduceSign;
  }

}
