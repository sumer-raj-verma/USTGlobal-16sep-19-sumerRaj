package com.ustglobal.retailermaintenancesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@Column
	private int pid;
	@Column
	private int orderid;
	@Column
	private String pname;
	@Column
	private int priceperunit;
	@Column
	private int quantity;
	
	@OneToOne(mappedBy="productBean")
	private Retailer retailer;
	
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPriceperunit() {
		return priceperunit;
	}
	public void setPriceperunit(int priceperunit) {
		this.priceperunit = priceperunit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
