package com.bank.models;

public class AccountClass {

	private long accountId = 0;
	private double bankBalance = 0.0;
	
public AccountClass(long accountId, double bankBalance) {
	this.accountId = accountId;
	this.bankBalance = bankBalance;
}

public void checkBalance() {
	System.out.println(bankBalance);
}

public void deposit(double newmoney) {
	bankBalance += newmoney;
}

public void withdraw(double cutmoney) {
	bankBalance -= cutmoney;
}

public void transfer(double sendmoney, long id) {
	bankBalance -= sendmoney;
	
}

}
