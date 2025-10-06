package arithematicexception;

import java.util.Scanner;

//Level 5 Program is  with dangerous statements and one try catch block to handle the exception with while loop to give Limited chances for user.

public class Level5_Divide_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		int chance=0;
		while(true) {
		try {
			System.out.println(a/b);
			break;
		}catch(ArithmeticException e) {
			if(chance == 3) {
				System.out.println("Sorry, you have reached you Maximum limit:");
				break;
			}
			System.out.println("You have only "+(3-chance)+" chances...");
			System.out.println("Re-Enter the valid B Number: ");
			b=sc.nextInt();
			chance++;
		}
	}
		System.out.println("Main Ends...");
		sc.close();
	}
}
