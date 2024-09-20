package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dto.Employee;

@WebServlet("/GetAllEmployees")
public class GetAllEmployees extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EmployeeDAO empDao=new EmployeeDAO();
		List<Employee> empList=empDao.getAllEmployees();
		RequestDispatcher rd=request.getRequestDispatcher("HRHomePage");
		rd.include(request, response);
		out.print("<br/>");
		out.print("<center>");
		if(empList != null) {
			out.print("<table border=2>");
			out.print("<tr>");
			out.print("<th>EmpId</th>");
			out.print("<th>EmpName</th>");
			out.print("<th>Salary</th>");
			out.print("<th>Gender</th>");
			out.print("<th>EmailId</th>");
			out.print("<th>Password</th>");
			out.print("</tr>");
			for(Employee emp:empList) {
				out.print("<tr>");
				out.print("<th>"+emp.getEmpId() +"</th>");
				out.print("<th>"+emp.getEmpName() +"</th>");
				out.print("<th>"+emp.getSalary() +"</th>");
				out.print("<th>"+emp.getGender() +"</th>");
				out.print("<th>"+emp.getEmailId() +"</th>");
				out.print("<th>"+emp.getPassword() +"</th>");
				out.print("</tr>");
				
			}
			out.print("</table>");
		}else {
			out.print("<h3>Records Not Found!!!</h3>");
		}
		out.print("<center/>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
