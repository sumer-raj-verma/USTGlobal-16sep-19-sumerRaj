package com.ustglobal.dbservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletClass extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId = Integer.parseInt(req.getParameter("id"));
		
		PrintWriter out = resp.getWriter();	
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection
			conn = DriverManager.getConnection(url);
			
			//issuee sql query
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, empId);
			rs = stmt.executeQuery();
			
			//read the result
			
			if (rs.next()){
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				
				out.println("Id :" + emp_id);
				out.println("Name :" + sal);
				out.println("Salary :" + name);
				out.println("Gender :" + gender);
				
				
//				out.println("<html>");
//				out.println("<body>");
//				out.println("<table border=2px>");
//				out.println("<tr>");
//				out.println("<th>");
//				out.println("Id");
//				out.println("Name");
//				out.println("Salary");
//				out.println("Gender");
//				out.println("</th>");
//				out.println("</tr>");
//				out.println("</body>");
//				out.println("</html>");
//				
				
			}else 
				out.println("Data Not Found");
			
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
			
		}finally{
			try{
			if(conn!= null){
				conn.close();
			}
			if (stmt!=null){
				stmt.close();
			}
			if(rs!= null){
				rs.close();
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
	

}

	}


