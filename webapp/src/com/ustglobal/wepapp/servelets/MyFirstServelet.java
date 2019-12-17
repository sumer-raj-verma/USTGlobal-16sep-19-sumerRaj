package com.ustglobal.wepapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServelet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method");
		System.out.println("Extra line of code");
		ServletContext context = getServletContext();
		String CompanyName = context.getInitParameter("company-name");
		
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("Batch-name");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		
		Date date = new Date();
		out.println("<h1 style='color:Red' > Date and Time is:");
		out.println(date.toString());
		out.println("</h1>");
		out.println("<h2>");
		out.println(CompanyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
	

		
		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		
		
		out.println("</body");
		out.print("</html>");
		
		
	}

}
