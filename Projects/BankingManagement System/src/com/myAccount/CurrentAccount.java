package com.myAccount;

public class CurrentAccount extends Account{
	
	public CurrentAccount() {
	}
	
	public CurrentAccount(String accHolderName, double accBalance) {
		super(accHolderName,accBalance);
	}

	@Override
	public void deposit(int amount) {
		if(amount > 0) {
			double accbalance = getAccBalance();
			accbalance = accbalance + amount;
			setAccBalance(accbalance);
			System.out.println(amount+" is Deposited Successfully...");
			System.out.println("The total Account Balance is : "+getAccBalance());
		}
		else {
			System.out.println("Invalid Deposit Amount ...");
		}
		
	}

	@Override
	public void withdraw(int amount) {
		double accbalance = getAccBalance();
		if(amount > 0 && amount < accbalance) {
			accbalance = accbalance - amount;
			System.out.println(amount+" Withdrawn Successfully...");
			System.out.println("Remaining Balance is : "+getAccBalance());
		}
		else {
			System.out.println("Invalid WithDrawal Amount...");
		}
	}

	@Override
	public void showBalance() {
		System.out.println("Available Balance is : "+getAccBalance());
	}

	@Override
	public double calculateInterest() {
		
		return getAccBalance()*2;
	}
	
	public void displayCurrentAccount() {
		System.out.println("Account Number :"+getAccoutNumber());
		System.out.println("Account Holder Name : "+getAccHolderName());
		System.out.println("Account Balance : "+getAccBalance());
		System.out.println("Interest rate : "+calculateInterest());
	}
	
}
