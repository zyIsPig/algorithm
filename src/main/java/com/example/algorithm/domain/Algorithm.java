package com.example.algorithm.domain;


public class Algorithm {

  private long algorithmId;
  private String algorithmName;
  private String algorithmIntro;
  private String algorithmCoverImg;
  private String algorithmCarousel;
  private String algorithmDetailContent;
  private long originalPrice;
  private long sellingPrice;
  private long algorithmSellStatus;
  private long createUser;
  private java.sql.Timestamp createTime;
  private long updateUser;
  private java.sql.Timestamp updateTime;
  private long popularity;
  private long sales;
  private String algorithmPath;


  public long getAlgorithmId() {
    return algorithmId;
  }

  public void setAlgorithmId(long algorithmId) {
    this.algorithmId = algorithmId;
  }


  public String getAlgorithmName() {
    return algorithmName;
  }

  public void setAlgorithmName(String algorithmName) {
    this.algorithmName = algorithmName;
  }


  public String getAlgorithmIntro() {
    return algorithmIntro;
  }

  public void setAlgorithmIntro(String algorithmIntro) {
    this.algorithmIntro = algorithmIntro;
  }


  public String getAlgorithmCoverImg() {
    return algorithmCoverImg;
  }

  public void setAlgorithmCoverImg(String algorithmCoverImg) {
    this.algorithmCoverImg = algorithmCoverImg;
  }


  public String getAlgorithmCarousel() {
    return algorithmCarousel;
  }

  public void setAlgorithmCarousel(String algorithmCarousel) {
    this.algorithmCarousel = algorithmCarousel;
  }


  public String getAlgorithmDetailContent() {
    return algorithmDetailContent;
  }

  public void setAlgorithmDetailContent(String algorithmDetailContent) {
    this.algorithmDetailContent = algorithmDetailContent;
  }


  public long getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(long originalPrice) {
    this.originalPrice = originalPrice;
  }


  public long getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(long sellingPrice) {
    this.sellingPrice = sellingPrice;
  }


  public long getAlgorithmSellStatus() {
    return algorithmSellStatus;
  }

  public void setAlgorithmSellStatus(long algorithmSellStatus) {
    this.algorithmSellStatus = algorithmSellStatus;
  }


  public long getCreateUser() {
    return createUser;
  }

  public void setCreateUser(long createUser) {
    this.createUser = createUser;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(long updateUser) {
    this.updateUser = updateUser;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getPopularity() {
    return popularity;
  }

  public void setPopularity(long popularity) {
    this.popularity = popularity;
  }


  public long getSales() {
    return sales;
  }

  public void setSales(long sales) {
    this.sales = sales;
  }


  public String getAlgorithmPath() {
    return algorithmPath;
  }

  public void setAlgorithmPath(String algorithmPath) {
    this.algorithmPath = algorithmPath;
  }

}
