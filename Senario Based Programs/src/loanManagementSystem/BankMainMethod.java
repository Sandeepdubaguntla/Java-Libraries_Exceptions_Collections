package loanManagementSystem;

import java.util.Scanner;

public class BankMainMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankOfFuture bf=new BankOfFuture("Sandeep", 8639500183l, "male");
		AcadamicRecords uptotenth = new AcadamicRecords("SricViswasathi", 80);
		AcadamicRecords uptoInter = new AcadamicRecords("viswasanthi", 80, "sasi", 90);
		AcadamicRecords uptobtech = new AcadamicRecords("viswasanthi", 80, "sasi", 90, "Kl University", 90);
		System.out.println("Welcome to Bank of Future");
		System.out.println("Loan Services you can avail here: \n 1.Educational Loan. \n 2.Housing loan. \n 3.Car Loan.");
		System.out.println("Enter you choice :");
		int choice = sc.nextInt();
	
		switch(choice) {
		case 1:{
			System.out.println("Welcome to the Education Loan Portal...");
			System.out.println("Please Enter the Required Details to move forword :");
			System.out.println("Enter you Aadhar Number :");
			long aadhar= sc.nextLong();
			System.out.println("Enter your Address ad upload the Address proof:");
			String address =sc.next();
			System.out.println("Enter your Educational Qualification:");
			String qualification=sc.next();
			System.out.println("Enter your pan Number :");
			String panNumber=sc.next();
			System.out.println("Enter the Exam you Attend for the University line Gre,Tofel....");
			String competativeExam=sc.next();
			System.out.println("Enter the Score you got in that Exam:");
			double score=sc.nextDouble();
			System.out.println("Enter the Loan Tenure :");
			int tenure=sc.nextInt();
			EducationalLoan el=new EducationalLoan(bf, aadhar, address, qualification, uptobtech, panNumber, competativeExam, score, tenure);
			el.interestCalculator();
		
		}break;
		case 2:{
			System.out.println("Welcome to the Housing Loan Portal...");
			System.out.println("Please Enter the Required Details to move forword :");
			System.out.println("Enter you Aadhar Number :");
			long aadhar= sc.nextLong();
			System.out.println("Enter your Address ad upload the Address proof:");
			String address =sc.next();
			System.out.println("Enter your Educational Qualification:");
			String qualification=sc.next();
			System.out.println("Enter your pan Number :");
			String panNumber=sc.next();
			System.out.println("Enter the Address of place :");
			String newAddress = sc.next();
			System.out.println("Enter the SquareFeet oF the plot :");
			double squareFeet = sc.nextDouble();
			System.out.println("Enter the Loan Tenure :");
			int tenure=sc.nextInt();
			HousingLoan hl=new HousingLoan(bf, aadhar, address, qualification, uptotenth, panNumber, newAddress, squareFeet, tenure);
			hl.interestCalculator();
			
			
			
		}break;
		case 3:{
			System.out.println("Welcome to the Car Loan Portal...");
			System.out.println("Please Enter the Required Details to move forword :");
			System.out.println("Enter you Aadhar Number :");
			long aadhar= sc.nextLong();
			System.out.println("Enter your Address ad upload the Address proof:");
			String address =sc.next();
			System.out.println("Enter your Educational Qualification:");
			String qualification=sc.next();
			System.out.println("Enter your pan Number :");
			String panNumber=sc.next();
			System.out.println("Enter the Type of Car :");
			String typeOfCar = sc.next();
			System.out.println("Enter the Loan Tenure :");
			int tenure=sc.nextInt();
			CarLoan cl=new CarLoan(bf, aadhar, address, qualification, uptoInter, panNumber, typeOfCar, tenure);
			cl.interestCalculator();

		}break;
		default:System.out.println("Enter the valid choice...");
		
		}
		sc.close();
	}
}
