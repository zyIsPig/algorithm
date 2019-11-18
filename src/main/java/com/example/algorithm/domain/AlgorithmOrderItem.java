package com.example.algorithm.domain;



public class AlgorithmOrderItem {

  private long algorithmOrderItemId;
  private long orderId;
  private long algorithmId;
  private String algorithmOrderName;
  private String algorithmCoverImg;
  private long sellingPrice;


  public long getAlgorithmOrderItemId() {
    return algorithmOrderItemId;
  }

  public void setAlgorithmOrderItemId(long algorithmOrderItemId) {
    this.algorithmOrderItemId = algorithmOrderItemId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getAlgorithmId() {
    return algorithmId;
  }

  public void setAlgorithmId(long algorithmId) {
    this.algorithmId = algorithmId;
  }


  public String getAlgorithmOrderName() {
    return algorithmOrderName;
  }

  public void setAlgorithmOrderName(String algorithmOrderName) {
    this.algorithmOrderName = algorithmOrderName;
  }


  public String getAlgorithmCoverImg() {
    return algorithmCoverImg;
  }

  public void setAlgorithmCoverImg(String algorithmCoverImg) {
    this.algorithmCoverImg = algorithmCoverImg;
  }


  public long getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(long sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

}
