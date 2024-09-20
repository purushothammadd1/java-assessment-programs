<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Employees</title>
</head>
<body>

	<% List<Employee> empList = (List<Employee>) request.getAttribute("empList"); %>

	<jsp:include page="HRHomePage.jsp" />

	<br />
	<center>
		<table border=2>
			<tr>
				<th>EmpId</th>
				<th>EmpName</th>
				<th>Salary</th>
				<th>Gender</th>
				<th>EmailId</th>
			</tr>

			<% for (Employee emp : empList) { %>
			<tr>
				<td><%= emp.getEmpId()    %></td>
				<td><%= emp.getEmpName()  %></td>
				<td><%= emp.getSalary()   %></td>
				<td><%= emp.getGender()   %></td>
				<td><%= emp.getEmailId()  %></td>
			</tr>
			<% } %>

		</table>
	</center>

</body>
</html>