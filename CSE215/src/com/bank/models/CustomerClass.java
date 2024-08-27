package com.bank.models;

public class CustomerClass {
	private long id;
	private String name;
	private String address;
	private long phoneNumber;
	private String email;
	private String Password;
		
public CustomerClass(String name, long id,String address, long phoneNumber, String email, String Password){
	//Constructor
	this.name = name;
	this.id = id;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.Password = Password;
}

public void displayCustomerInfo() {
	System.out.println("Account Holder Name: "+ name);
	System.out.println("Holder ID: "+ id);
	System.out.println("Address: "+ address);
	System.out.println("Contact: 0"+ phoneNumber);
	System.out.println("Email: "+ email);
}
//GETTERS AND SETTERS
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getPassword() {
	return Password;
}
public void setPassword(String Password) {
	this.Password = Password;
}
@Override
public String toString() {
	return "Customer{Name= "+ name + " ID= " + id + " Address= " + address + " PhoneNumber= " + phoneNumber + " Email = " + email + "}";
}

	}


