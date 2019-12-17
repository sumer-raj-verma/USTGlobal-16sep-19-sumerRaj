package com.ustglobal.retailmaintenance.service;

import com.ustglobal.retailermaintenancesystem.dto.ProductBean;
import com.ustglobal.retailermaintenancesystem.dto.Retailer;

public class RetailerService {
	

	public Retailer login(int id ,String password);
	public int register(Retailer bean);
	public ProductBean searchProduct(int id);
	public Retailer searchRetailer(int id);
	public boolean updatePassword(int id , String password);
	public int amountPayable();
	public int retriveOrder(int id);
	

}
