package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet{
	
	public void init() {
		System.out.println("I Have been Initialzed");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=red text=yellow>");
		out.print("<h1><center>Welcome to Servlet </center></h1>");
		out.print("</body>");
		out.print("</html>");
		
		System.out.println("Iam working...");
		
	}
	public void destroy() {
		System.out.println("I Destroyed..");
	}

}
