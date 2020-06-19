package com.sgcc.entity;

public class Out {

  private long outid;
  private long projectid;
  private java.sql.Date outdate;
  private String starter;
  private String picker;
  private String outprice;


  public long getOutid() {
    return outid;
  }

  public void setOutid(long outid) {
    this.outid = outid;
  }


  public long getProjectid() {
    return projectid;
  }

  public void setProjectid(long projectid) {
    this.projectid = projectid;
  }


  public java.sql.Date getOutdate() {
    return outdate;
  }

  public void setOutdate(java.sql.Date outdate) {
    this.outdate = outdate;
  }


  public String getStarter() {
    return starter;
  }

  public void setStarter(String starter) {
    this.starter = starter;
  }


  public String getPicker() {
    return picker;
  }

  public void setPicker(String picker) {
    this.picker = picker;
  }


  public String getOutprice() {
    return outprice;
  }

  public void setOutprice(String outprice) {
    this.outprice = outprice;
  }

}
