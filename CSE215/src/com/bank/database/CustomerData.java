package com.bank.database;
import 	java.util.ArrayList;
import com.bank.models.CustomerClass;

public class CustomerData extends ArrayList<CustomerClass> {
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2799799702151149622L;


	//public CustomerData(String n, long i,String a, long p, String e, String P) {
	//	this.add(new CustomerClass(n, i, a, p, e, P));
	//}
	
	public void addCustomer(String n, long i, String a, long p, String e, String P) {
		this.add(new CustomerClass(n,i,a,p,e,P));
	}
	
	
	public void print() {
		for (CustomerClass customers : this) {
			System.out.println(customers.getName());
		}
	}
	
	
	public boolean infoCheck(String x) { // Checking Arraylist for name and password
		for (CustomerClass n: this) {
			if(n.getName().equals(x)) {
				return true;
				
			}
		}
		return false;
		
		}
	public boolean passCheck(String P) {
		for (CustomerClass s: this) {
			if(s.getPassword().equals(P)) {
				return true;
			}
		}
		return false;
	}

}
