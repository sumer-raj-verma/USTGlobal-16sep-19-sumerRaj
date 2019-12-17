package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebapp.dao.EmployeeDAo;
import com.ustglobal.empwebapp.dao.EmployeeDaoManager;
import com.ustglobal.empwebapp.dto.EmployeeInfo;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		EmployeeInfo info = new EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		
		EmployeeDAo dao = EmployeeDaoManager.getEmployeeDAo();
		boolean check =dao.registerEmployee(info);
		
		
		PrintWriter out = resp.getWriter();
		if(check) {
			out.println("<html>");
			out.println("<h4>Registration Completed</h4>");
			out.println("</html>");
		}else {
			out.println("<html>");
			out.println("<h4>Id Cannot be Repeted</h4>");
			out.println("</html>");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
		dispatcher.include(req, resp);
		
		
		
		
	}

}
