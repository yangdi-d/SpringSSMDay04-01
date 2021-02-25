package com.ujiuye.pojo;


import java.io.Serializable;

public class Person implements Serializable {

  private int id;
  private String name;
  private String qqnum;
  private String qqpwd;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getQqnum() {
    return qqnum;
  }

  public void setQqnum(String qqnum) {
    this.qqnum = qqnum;
  }


  public String getQqpwd() {
    return qqpwd;
  }

  public void setQqpwd(String qqpwd) {
    this.qqpwd = qqpwd;
  }


  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", qqnum='" + qqnum + '\'' +
            ", qqpwd='" + qqpwd + '\'' +
            '}';
  }
}
