<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

function deleteUser(mail) {
	alert('triggred Delete button' + mail);
	//http://localhost:8080/whatsapp/deleteUser?mailIdToDelete='virat@gmail.com'
	document.forms[0].action="${pageContext.request.contextPath}/deleteUser?mailIdToDelete="+mail;
	document.forms[0].method="post";
	document.forms[0].submit();	
	//submit to deleteUser action from here
}

function editUser(mail) {
	alert('triggered Edit button' + mail);	
	document.forms[0].action="${pageContext.request.contextPath}/editUser1?mailIdToEdit="+mail;
	document.forms[0].method="post";
	document.forms[0].submit();	
	
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<cr:url value="/j_spring_security_logout" />" >Logout</a>
	<form action=" ">
	<!-- Need to writh for each in jsp to iterate userList -->
	<table border="3">
		<tr>
		 	<th>Name</th>
		 	<th>Mobile</th>
		 	<th>Mail</th>
		 	<th>City</th>
		 	<th>Password</th>
		</tr>
		<cr:forEach  var="userObject" items="${uList}">
			<tr>
				<td>${userObject.name}</td>
				<td>${userObject.mobile}</td>
				<td>${userObject.email}</td>
				<td>${userObject.city}</td>
				<td>${userObject.pwd}</td>
				<td><input type="button" onclick="editUser('${userObject.email}')" value="Edit"></td>
				<td><input type="button" onclick="deleteUser('${userObject.email}')" value="Delete"></td>
			</tr>
		</cr:forEach>
	</table>
	</form>
</body>
</html>