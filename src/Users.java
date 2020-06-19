package com.sgcc.entity;

public class Users {

  private long userid;
  private String userpass;
  private String username;


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getUserpass() {
    return userpass;
  }

  public void setUserpass(String userpass) {
    this.userpass = userpass;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Users{" +
            "userid=" + userid +
            ", userpass='" + userpass + '\'' +
            ", username='" + username + '\'' +
            '}';
  }

  public Users() {
  }

  public Users(long userid, String userpass, String username) {
    this.userid = userid;
    this.userpass = userpass;
    this.username = username;
  }
}
