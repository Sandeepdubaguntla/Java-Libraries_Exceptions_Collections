package loanManagementSystem;

public class EducationalLoan extends BankOfFuture{
	
	private BankOfFuture bank;
	
	private long aadharNumber;
	private String address;
	private String qualification;
	private AcadamicRecords acadamics;
	private String panNumber;
	private String competativeExamAttended;
	private double scoreOfExam;
	private int loanTenure;
	
	public EducationalLoan(BankOfFuture bank, long aadharNumber, String address, String qualification,
			AcadamicRecords acadamics, String panNumber, String competativeExamAttended, double scoreOfExam,int loanTenure) {

		this.bank = bank;
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.qualification = qualification;
		this.acadamics = acadamics;
		this.panNumber = panNumber;
		this.competativeExamAttended = competativeExamAttended;
		this.scoreOfExam = scoreOfExam;
		this.loanTenure=loanTenure;
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

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getCompetativeExamAttended() {
		return competativeExamAttended;
	}

	public void setCompetativeExamAttended(String competativeExamAttended) {
		this.competativeExamAttended = competativeExamAttended;
	}

	public double getScoreOfExam() {
		return scoreOfExam;
	}

	public void setScoreOfExam(double scoreOfExam) {
		this.scoreOfExam = scoreOfExam;
	}


	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	
	@Override
	public void interestCalculator() {
		System.out.println("The Interest for the Education loan , after verifying all the documents is : 8.55%");
		System.out.println("Thank you for choosing our Bank....");
	}
	
}
