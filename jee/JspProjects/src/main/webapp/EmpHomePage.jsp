<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="ISO-8859-1">
<title>EmpHomePage</title>
</head>
<body>
<% String emailId = (String) session.getAttribute("emailId"); %>
		
		<body bgcolor=lightyellow text=blue>
		
		<h3> Welcome <%=  emailId %>! </h3>
		
		<form style='float:right;'>
		<a href='EmpHomePage.jsp'>Home</a> &nbsp;
		<a href='Login.html'>Logout</a>
		</form>
		
		<center><h1> Welcome to Employee HomePage </h1>
		<a href='Profile.jsp'>ShowProfile</a>
		</center>
		</body>
		</html>

</body>
</html>