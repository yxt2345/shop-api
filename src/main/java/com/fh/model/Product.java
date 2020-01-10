package com.fh.model;

public class Product {
  private Integer  id;//	int(10)	商品ID
  private String  productName;//	varchar(300)	商品名称
  private Double  productPrice;//	decimal	商品价格

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
