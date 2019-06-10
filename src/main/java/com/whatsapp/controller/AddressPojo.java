package com.whatsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressPojo {
private String city;
private int pincode;
@Autowired
private DepartmentPojo dept;

public AddressPojo() {
	System.out.println("test Address");
	System.out.println("inside no arg constructor :: Address");
}

public DepartmentPojo getDept() {
	return dept;
}

public void setDept(DepartmentPojo dept) {
	this.dept = dept;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
