package com.ustglobal.librarymanagementsystem.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;


@Entity
@Table
public class StudentBean {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String rollno;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String department;
	@Column
	private String gender;
	@Exclude
	@OneToMany(mappedBy = "student")
	private List<BookIssue> bookIssue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<BookIssue> getBookIssue() {
		return bookIssue;
	}
	public void setBookIssue(List<BookIssue> bookIssue) {
		this.bookIssue = bookIssue;
	}
	
	
	
	
	
	
	
}
