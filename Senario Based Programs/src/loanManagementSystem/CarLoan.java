package loanManagementSystem;

public class CarLoan extends BankOfFuture{
	
	private BankOfFuture bank;
	
	private long aadharNumber;
	private String address;
	private String qualification;
	private AcadamicRecords acadamics;
	private String panNumber;
	private String typeOfCar;
	private int loanTenure;
	public CarLoan(BankOfFuture bank, long aadharNumber, String address, String qualification,
			AcadamicRecords acadamics, String panNumber, String typeOfCar,
			int loanTenure) {
		super();
		this.bank = bank;
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.qualification = qualification;
		this.acadamics = acadamics;
		this.panNumber = panNumber;
		this.typeOfCar=typeOfCar;
		this.loanTenure = loanTenure;
	}
	public BankOfFuture getBank() {
		return bank;
	}
	public void setBank(BankOfFuture bank) {
		this.bank = bank;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public AcadamicRecords getAcadamics() {
		return acadamics;
	}
	public void setAcadamics(AcadamicRecords acadamics) {
		this.acadamics = acadamics;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getTypeOfCar() {
		return typeOfCar;
	}
	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}
	
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	
	@Override
	public void interestCalculator() {
		System.out.println("The Interest for the Car loan , after verifying all the documents is : 9.00%");
		System.out.println("We also took the Credit Score into Consideration");
		System.out.println("Thank you for choosing Bank of Future...");
	}
	
}
