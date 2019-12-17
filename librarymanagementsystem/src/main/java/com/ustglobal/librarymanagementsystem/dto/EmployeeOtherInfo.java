package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="EmpOtherInfo")
public class EmployeeOtherInfo {
	
	
	
	@Id
	@Column
	private int eid;
	@Column
	private String Fname;
	@Column
	private String pancard;
	
	@OneToOne
	@JoinColumn(name="id")
	private EmployeeInfo emp;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public EmployeeInfo getEmp() {
		return emp;
	}

	public void setEmp(EmployeeInfo emp) {
		this.emp = emp;
	}
	
	
	
	
	

}
