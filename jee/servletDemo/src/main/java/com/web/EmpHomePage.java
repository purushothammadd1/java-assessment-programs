package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EmpHomePage")
public class EmpHomePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
//		String emailId=request.getParameter("emailId");
		HttpSession session=request.getSession(false);
		String emailId=(String) session.getAttribute("emailId");
		out.print("<body bgcolor=lightyellow text=cyan>");
		out.print("<h3>Welcom "+emailId+"!</h3>");
		out.print("<form style='float:right;'>");
		out.print("<a href='EmpHomePage'>Home</a> &nbsp;");
		out.print("<a href='Login.html'>Logout</a>");
		out.print("</form>");
		out.print("<center><h1>Welcome to Employee HomePage</h1>");
		out.print("<a href='Profile'>Show Profile</a>");
		out.print("</center>");
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
