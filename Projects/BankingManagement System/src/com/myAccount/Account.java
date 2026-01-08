package com.myAccount;

import java.util.Random;

public abstract class Account {
	private long accoutNumber;
	private String accHolderName;
	private double accBalance;
	
	public Account() {}
	
	Random r=new Random();
	
	public Account(String accHolderName, double accBalance) {
		this.accoutNumber = r.nextLong(123456789111L);
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}
	
	public long getAccoutNumber() {
		return accoutNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public abstract void deposit(int amount);
	public abstract void withdraw(int amount);
	public abstract void showBalance();
	public abstract double calculateInterest(); 
	
}
