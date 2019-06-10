package com.whatsapp.controller;

import org.springframework.stereotype.Service;

@Service
public class DepartmentPojo {
private int dId;
private String dName;
private String dloc;

public DepartmentPojo() {
	System.out.println("test Department");
	System.out.println("inside no arg constructor :: Department");
}
public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getDloc() {
	return dloc;
}
public void setDloc(String dloc) {
	this.dloc = dloc;
}

}
