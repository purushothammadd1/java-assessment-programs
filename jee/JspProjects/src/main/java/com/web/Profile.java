package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Employee;


@WebServlet("/Profile")
public class Profile extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		Employee emp=(Employee) session.getAttribute("emp");
		
		RequestDispatcher rd=request.getRequestDispatcher("EmpHomePage.jsp");
		rd.include(request, response);
		out.print("<br/>");
		out.print("<center>");
		out.print("<table border=2>");
		out.print("<tr>");
		out.print("<th>EmpId</th>");
		out.print("<th>EmpName</th>");
		out.print("<th>Salary</th>");
		out.print("<th>Gender</th>");
		out.print("<th>EmailId</th>");
		out.print("<th>Password</th>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<th>" + emp.getEmpId()    + "</th>");
		out.print("<th>" + emp.getEmpName()  + "</th>");
		out.print("<th>" + emp.getSalary()   + "</th>");
		out.print("<th>" + emp.getGender()   + "</th>");
		out.print("<th>" + emp.getEmailId()  + "</th>");
		out.print("<th>" + emp.getPassword()  + "</th>");
		out.print("</tr>");

		out.print("</table>");
		out.print("</center>");
		

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
