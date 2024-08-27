package com.bank.database;
import 	java.util.ArrayList;
import com.bank.models.CustomerClass;

public class CustomerData extends ArrayList<CustomerClass> {

	public CustomerData(String x, long i,String a, long p, String e, String P) {
		this.add(new CustomerClass(x, i, a, p, e, P));
	}
	
	public void print() {
		for (CustomerClass customers : this) {
			System.out.println(customers);
		}
	}

}
