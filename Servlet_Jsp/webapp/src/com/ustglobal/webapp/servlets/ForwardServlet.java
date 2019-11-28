package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> This is Forward Servlet </h1>");
		out.println("</body>");
		out.println("</html>");
		
		Object obj = new Object();
		req.setAttribute("obj", obj);
		
		RequestDispatcher rd = req.getRequestDispatcher("/first");
		
		rd.forward(req, resp);
	}
}
