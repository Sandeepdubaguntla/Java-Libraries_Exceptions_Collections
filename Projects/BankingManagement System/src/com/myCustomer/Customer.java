package com.myCustomer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import com.myAccount.Account;
import com.myAccount.CurrentAccount;
import com.myAccount.SavingsAccount;

public class Customer {
	private String customerName;
	private int cusId;
	private long cusMobileno;
	private String gender;
	
	private Account a;
	
	public Customer() {}
	
	Random r = new Random();

	public Customer(String customerName, long cusMobileno, String gender) {
		super();
		this.customerName = customerName;
		this.cusId = r.nextInt(1234);
		this.cusMobileno = cusMobileno;
		this.gender = gender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public long getCusMobileno() {
		return cusMobileno;
	}

	public void setCusMobileno(long cusMobileno) {
		this.cusMobileno = cusMobileno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void customerDetails() {
		System.out.println("Customer Name :"+getCustomerName());
		System.out.println("Customer ID :"+getCusId());
		System.out.println("Customer MobileNumber :"+getCusMobileno());
		System.out.println("Customer Gender :" +getGender());
		System.out.println("-----------------------------------------------");
	}
	
	ArrayList<SavingsAccount> sa = new ArrayList<>();
	ArrayList<CurrentAccount> ca = new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void createAccount(Account a) {
		boolean cond = true;
		
		while(cond) {
			System.out.println("Enter you choice . \n 1.Savings Account \n 2.Currect Account \n press 1 to create Savings Account and Press 2 to create Current Account.");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
			{	
				System.out.println("Enter the Account HolderName :");
				String holdername=sc.next();
				System.out.println("Enter the initial Account Balance :");
				double balance = sc.nextDouble();
				sa.add(new SavingsAccount(holdername, balance));
				System.out.println("Hey "+getCustomerName()+" Your Account Created Successfully with Account no : "+a.getAccoutNumber());
				
			}
			break;
			case 2:
			{
				System.out.println("Enter the Account HolderName :");
				String holdername=sc.next();
				System.out.println("Enter the initial Account Balance :");
				double balance = sc.nextDouble();
				ca.add(new CurrentAccount(holdername, balance));
				System.out.println("Hey "+getCustomerName()+" Your Account Created Successfully with Account no : "+a.getAccoutNumber());
			}
			break;
			case 3:
			{
				cond = false;
				System.out.println("Thank you....");
			}
			break;
			default: System.out.println("Enter valid option...");
			}
		}
		return;
	}
	
	public void showAccount() {
		if(ca.isEmpty() || sa.isEmpty()) {
			System.out.println("No Accounts added yet...");
			return ; //to return the cursor out.
		}
		else {
			for(CurrentAccount c : ca) {
				c.displayCurrentAccount();
			}
			System.out.println("-----------------------------------------------------");
			for(SavingsAccount s : sa) {
				s.displaySavingsAccount() ;
			}
		}
	}
	
	public Account getAccount(long accountNo) {
		if(ca.isEmpty() || sa.isEmpty()) {
			System.out.println("No Accounts are Added yet...");
		}
		else {
			for(CurrentAccount c :ca) {
				if(c.getAccoutNumber() == accountNo) {
					return a;
				}
			}
			for(SavingsAccount s :sa) {
				if(s.getAccoutNumber() == accountNo) {
					return a;
				}
			}
		}
		return null;
	}
	
	public void depositToAccount(int cid,long accountNo,int amount) {
		
	}
	
	public void WithdrawFromAccount(int cid,long accountNo,int amount) {
		if(ca.isEmpty() || sa.isEmpty()) {
			System.out.println("No Accounts are Added yet...");
		}
		else if(this.getCusId()==cid) { 
			for(CurrentAccount c :ca) {
				if(c.getAccoutNumber() == accountNo) {
					c.withdraw(amount);
				}
			}
			for(SavingsAccount s :sa) {
				if(s.getAccoutNumber() == accountNo) {
					s.withdraw(amount);
				}
			}
		}
	}
	public void showBalance(int cid ,long accountNo) {
		if(this.getCusId()==cid) {
			if(ca.isEmpty() || sa.isEmpty()) {
				System.out.println("No Accounts are Added yet...");
			}
			else {
				for(CurrentAccount c :ca) {
					if(c.getAccoutNumber() == accountNo) {
						c.showBalance();
					}
				}
				for(SavingsAccount s :sa) {
					if(s.getAccoutNumber() == accountNo) {
						s.showBalance();
					}
				}
			}
		}
		else
			System.out.println("No Customer Exist with the given ID...");
	}
	
	public void removeAccountByAccNumber(long accountNo) {
		if(ca.isEmpty() || sa.isEmpty()) {
			System.out.println("No Accounts are Added yet ...");
		}
		else {
			Iterator<SavingsAccount> itr1 = sa.iterator();	
			Iterator<CurrentAccount> itr2 = ca.iterator();
			while(itr1.hasNext()) {
				SavingsAccount s=itr1.next();
				if(s.getAccoutNumber() == accountNo)
					itr1.remove();
			}
			while(itr2.hasNext()) {
				CurrentAccount c=itr2.next();
				if(c.getAccoutNumber() == accountNo)
					itr2.remove();
			}
		}
		
	}
	
}









