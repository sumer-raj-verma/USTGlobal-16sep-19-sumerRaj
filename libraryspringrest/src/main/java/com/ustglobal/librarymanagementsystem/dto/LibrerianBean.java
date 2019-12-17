package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table
public class LibrerianBean {
	@Id
	@Column
	@GeneratedValue
	private String libid;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String gender;
	public String getLibid() {
		return libid;
	}
	public void setLibid(String libid) {
		this.libid = libid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
}
