package com.ek.basic.demo3.model.po;

import java.util.Date;

/**
 * 订单 m_orders
 * 
 * @author EK
 * @date 2017年8月26日
 */
public class Orders {

  private Integer id;
  private Integer userId;
  private String number;
  private Date createTime;
  private String note;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}