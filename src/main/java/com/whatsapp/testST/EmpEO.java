package com.whatsapp.testST;

public class EmpEO {
	public static EmpEO e=new EmpEO();
private EmpEO()
{}
public static EmpEO getInstance()
{
	e=null;
	return e;
}
}
