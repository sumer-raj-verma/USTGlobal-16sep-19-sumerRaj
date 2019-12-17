package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="experience")
public class Experiance {
	
	
	@Id
	@Column
	private int expid;
	@Column
	private String companyname;
	@Column
	private int years;
	public int getExpid() {
		return expid;
	}
	public void setExpid(int expid) {
		this.expid = expid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmployeeInfo emp;
	public EmployeeInfo getEmp() {
		return emp;
	}
	public void setEmp(EmployeeInfo emp) {
		this.emp = emp;
	}
	
	
	
	

}
