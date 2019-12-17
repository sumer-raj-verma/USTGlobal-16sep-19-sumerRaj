package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAo;
import com.ustglobal.empwebapp.dao.EmployeeDaoManager;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
@WebServlet("/changepassword")
public class ChangepasswordServlet extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass =req.getParameter("password");
			String confirmpass = req.getParameter("confirmpassword");

			PrintWriter out = resp.getWriter();
			if(pass.equals(confirmpass)) {


				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
				EmployeeDAo dao = EmployeeDaoManager.getEmployeeDAo();
				boolean check = dao.changePassword(info.getId(), pass);
				if (check) {
					RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
					dispatcher.forward(req, resp);
				} else {
					out.println("Something went wrong!!!");
					RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.html");
					dispatcher.include(req, resp);
				}
				
			}else {
				out.println("<html>");
				out.println("<h4>Password not matching<h4>");
				out.println("</html>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.html");
				dispatcher.include(req, resp);
			}
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}
	}

}
