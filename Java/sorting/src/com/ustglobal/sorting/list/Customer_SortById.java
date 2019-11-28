package com.ustglobal.sorting.list;

import java.util.Comparator;

public class Customer_SortById implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		Integer i = o1.id;
		Integer j = o2.id;
		return i.compareTo(j);
	}

}
