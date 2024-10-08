package com.bank.database;
import 	java.util.ArrayList;
import com.bank.models.CustomerClass;

public  class CustomerData extends ArrayList<CustomerClass> {
	
	private static final long serialVersionUID = 2799799702151149622L;

	static CustomerData dataSet = new CustomerData();
	//public CustomerData(String n, long i,String a, long p, String e, String P) {
	//	this.add(new CustomerClass(n, i, a, p, e, P));
	//}
	
	public static void addCustomer(String n, long i, String a, long p, String e, String P) {
		dataSet.add(new CustomerClass(n,i,a,p,e,P));
	}
	
	
	public void print() {
		for (CustomerClass customers : dataSet) {
			System.out.println(customers.getName());
		}
	}
	
	
	public static boolean infoCheck(String x, String P) { // Checking Arraylist for name and password
		for (CustomerClass n: dataSet) {
			if(n.getName().equals(x) && n.getPassword().equals(P)) {
				return true;
				
			}
		}
		return false;
		
		}
	public static boolean passCheck(String P) {
		for (CustomerClass s: dataSet) {
			if(s.getPassword().equals(P)) {
				return true;
			}
		}
		return false;
	}

}
