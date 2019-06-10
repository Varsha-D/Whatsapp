<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>
${errormsg}
<h3>Update User Details</h3>
<form action="UpdateUser">
Email-Id: <input type="text" name="email" value="${userObj.email }"/></br>
Name:<input type="text" name="name" value="${userObj.name }"/></br>
Contact No: <input type="text" name="mobile" value="${userObj.mobile }"/></br>
City : <input type="text" name="city" value="${userObj.city }"/></br>
Password : <input type="password" name="pwd" value="${userObj.pwd }"/></br>
 <input type="hidden" name="versionNum" value="${userObj.versionNum }"/></br>
<input type="submit" value="Update">

</form>
</body>
</html>