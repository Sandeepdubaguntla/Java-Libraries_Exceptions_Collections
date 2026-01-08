package com.mybank;

import java.util.ArrayList;
import java.util.Iterator;

import com.myCustomer.Customer;

public class Bank {
	private String bankName;
	
	private Customer c;
	
	public Bank() {}

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}
	
	ArrayList<Customer> cus = new ArrayList<Customer>(); 
	
	public void addCustomer(Customer c) {
		
	}
	
	public void showCustomer() {
		if(cus.isEmpty()) {
			System.out.println("No Customers are there yet.....");
		}
		else {
			for(Customer c:cus) {
				c.customerDetails();
			}
		}
	}
	
	public void removeCustomer(int cid) {
		if(cus.isEmpty())
			System.out.println("No Customer is present....");
		else {
			Iterator<Customer> itr = cus.iterator();
			while(itr.hasNext()) {
				Customer cust=itr.next();
				if(cust.getCusId() == cid) {
					itr.remove();
				}
			}
		}
	}
	
	
	
}
