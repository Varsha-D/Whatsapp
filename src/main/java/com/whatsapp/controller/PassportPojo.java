package com.whatsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PassportPojo {
private int pptId;
private String issuedCity;
@Autowired
private AddressPojo add;

public PassportPojo() {
	System.out.println("test Passport");
	System.out.println("inside no arg constructor :: Passsport");
}

public int getPptId() {
	return pptId;
}
public void setPptId(int pptId) {
	this.pptId = pptId;
}
public String getIssuedCity() {
	return issuedCity;
}
public AddressPojo getAdd() {
	return add;
}

public void setAdd(AddressPojo add) {
	this.add = add;
}

public void setIssuedCity(String issuedCity) {
	this.issuedCity = issuedCity;
}


}
