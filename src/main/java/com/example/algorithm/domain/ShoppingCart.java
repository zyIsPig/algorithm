package com.example.algorithm.domain;



public class ShoppingCart {

  private long cartId;
  private long buyerId;
  private long isDeleted;


  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }


  public long getBuyerId() {
    return buyerId;
  }

  public void setBuyerId(long buyerId) {
    this.buyerId = buyerId;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

}
