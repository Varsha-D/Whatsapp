package com.whatsapp.controller;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.whatsapp.controller.PassportPojo;

 @Component
public class EmployeePojo {
private Integer eId;
private String eName;
private String eCity;
private String eCompany;
private String eSalary;
@Autowired
private PassportPojo pPort;

public EmployeePojo()
{
	System.out.println("test Employee");
	System.out.println("inside no arg constructor :: Employee");
}

/*public EmployeePojo(PassportPojo p) {
	System.out.println("inside passport argument constructor :: Employee");
	this.pPort=p;
}*/
public String geteSalary() {
	return eSalary;
}
public void seteSalary(String eSalary) {
	this.eSalary = eSalary;
}
public PassportPojo getpPort() {
	return pPort;
}
public void setpPort(PassportPojo pPort) {
	this.pPort = pPort;
}
public Integer geteId() {
	return eId;
}
public void seteId(Integer eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteCity() {
	return eCity;
}
public void seteCity(String eCity) {
	this.eCity = eCity;
}
public String geteCompany() {
	return eCompany;
}
public void seteCompany(String eCompany) {
	this.eCompany = eCompany;
}

}
