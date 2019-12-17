package com.ustglobal.empwebapp.dao;

public class EmployeeDaoManager {
	
	
	private EmployeeDaoManager() {

}
	
	public static EmployeeDAo getEmployeeDAo() {
		return new EmployeeDaoJdbcImpl();
	}
}
