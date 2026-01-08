package loanManagementSystem;

import java.util.Random;

public class BankOfFuture {

	Random r = new Random();
	private long accountNo;
	private String accHolderName;
	private long mobileNum;
	private String gender;

	public BankOfFuture() {
	}

	public BankOfFuture(String accHolderName, long mobileNum, String gender) {
		super();
		this.accountNo = r.nextLong(12345678923l);
		this.accHolderName = accHolderName;
		this.mobileNum = mobileNum;
		this.gender = gender;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public void interestCalculator() {
		System.out.println("Interest is 5%");
	}

}
