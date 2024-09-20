<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HR HomePage</title>
</head>

<body bgcolor=lightyellow text=blue>

	<% String emailId = (String) session.getAttribute("emailId"); %>

	<h3>
		Welcome
		<%=emailId%>!
	</h3>

	<form style='float: right;'>
		<a href='HRHomePage.jsp'>Home</a> &nbsp; 
		<a href='Login.html'>Logout</a>
	</form>


	<center>
		<h1>Welcome to HR HomePage</h1>

		<a href='GetAllEmployees'>GetAllEmployees </a>&nbsp;&nbsp;
		 <a href='GetEmpById.jsp'>GetEmployeeById</a> <br />

	</center>
</body>

</html>