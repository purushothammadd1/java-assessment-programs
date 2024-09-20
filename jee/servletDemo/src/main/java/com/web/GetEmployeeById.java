package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dto.Employee;


@WebServlet("/GetEmployeeById")
public class GetEmployeeById extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int empId = Integer.parseInt(request.getParameter("empId"));

		EmployeeDAO empDAO = new EmployeeDAO();
		Employee emp = empDAO.getEmployeeById(empId);

		out.print("<br/>");
		out.print("<center>");
		
		if (emp != null) {

			request.setAttribute("emp", emp);
			
			RequestDispatcher rd = request.getRequestDispatcher("GetEmployeeById.jsp");
			rd.forward(request, response);
			

		} else {
			
			RequestDispatcher rd = request.getRequestDispatcher("HRHomePage.jsp");
			rd.include(request, response);
			
			out.print("<h1 style='color:red;'>Record Not Found!!!</h1>");			
		}

		out.print("</center>");


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}