package com.sgcc.entity;


public class Imports {

  private long insid;
  private long projectid;
  private java.sql.Date insdate;
  private String totalprice;
  private long batch;
  private String receiver;


  public long getInsid() {
    return insid;
  }

  public void setInsid(long insid) {
    this.insid = insid;
  }


  public long getProjectid() {
    return projectid;
  }

  public void setProjectid(long projectid) {
    this.projectid = projectid;
  }


  public java.sql.Date getInsdate() {
    return insdate;
  }

  public void setInsdate(java.sql.Date insdate) {
    this.insdate = insdate;
  }


  public String getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(String totalprice) {
    this.totalprice = totalprice;
  }


  public long getBatch() {
    return batch;
  }

  public void setBatch(long batch) {
    this.batch = batch;
  }


  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

}
