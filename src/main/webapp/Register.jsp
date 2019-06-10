<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">${errormsg}</font>
<form action="userregister"> 
Email-Id: <input type="text" name="email"/></br>
Name:<input type="text" name="name"/></br>
Contact No: <input type="text" name="mobile"/></br>
City : <input type="text" name="city"/></br>
Password : <input type="password" name="pwd"/></br>
<input type="submit" value="register">
</form>

<form action="TestIoc">
<input type="submit" align="right" value="Test"/>
</form>

<a href="LoginPg.jsp">Loginpage</a>
</body>
</html>