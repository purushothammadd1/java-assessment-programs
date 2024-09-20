<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Employee emp = (Employee) request.getAttribute("emp"); %>

	<center>

		<jsp:include page="HRHomePage.jsp" />
		<br />

		<table border=2>
			<tr>
				<th>EmpId</th>
				<th>EmpName</th>
				<th>Salary</th>
				<th>Gender</th>
				<th>EmailId</th>
			</tr>


			<tr>
				<th><%= emp.getEmpId()    %></th>
				<th><%= emp.getEmpName()   %></th>
				<th><%= emp.getSalary()    %></th>
				<th><%= emp.getGender()    %></th>
				<th><%= emp.getEmailId()   %></th>
			</tr>

		</table>
	</center>

</body>
</html>