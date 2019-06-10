package com.whatsapp.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="user")

public class AddPojos
{
@Id
private String email;
private String name;
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
private String mobile;
private String city;
private String pwd;
private String role="ROLE_USER";

@Version
@Column(name="versionno")
private long versionNum;


public long getVersionNum() {
	return versionNum;
}
public void setVersionNum(long versionNum) {
	this.versionNum = versionNum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
