<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="HRHomePage.jsp" />
	<br/>

<center>

	<form action="GetEmployeeById" method="post">
		Enter Employee Id:  <input type="text" name="empId"  /> <br /> <br />
		<input type="submit" value="GetEmployee" />
	</form>
</center>

</body>
</html>