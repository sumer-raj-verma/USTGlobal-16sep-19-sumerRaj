package com.ustglobal.librarymanagementsystem.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table
public class BookBean {
	@Id
	@Column
	@GeneratedValue
	private int bid;
	@Column
	private String bname;
	@Column
	private String bauthor;
	@Column
	private String publication;
	@OneToMany(mappedBy = "book")
	private List<BookIssue> bookIssue;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public List<BookIssue> getBookIssue() {
		return bookIssue;
	}
	public void setBookIssue(List<BookIssue> bookIssue) {
		this.bookIssue = bookIssue;
	}
	
	
	
	
	
	
	
}
