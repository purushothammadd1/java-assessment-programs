package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dto.Employee;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String gender=request.getParameter("gender");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		
		Employee emp=new Employee(empId,empName,salary,gender,emailId,password);
		EmployeeDAO empDAO=new EmployeeDAO();
		int result = 0;
		try {
			result = empDAO.registerEmployee(emp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("<body bgcolor='lightyellow'>");
		out.print("<center>");
		if(result >0) {
			out.print("<br/>");
			out.print("<h2 style='color:green;'>Employee Registered successfully...</h2><br/>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			
		}else {
			out.print("</br>");
			out.print("<h2 style='color:red;'>Employee Registeration Failed...</h2><br/>");
			RequestDispatcher rd=request.getRequestDispatcher("Register.html");
			rd.include(request, response);
			
		}
		out.print("</center></body>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
