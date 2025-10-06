package arithematicexception;

import java.util.Scanner;

/*Level 4 Program is  with dangerous statements and one try catch block to handle the exception
  with while loop to give infinite chances for user.*/

public class Level4_Divide_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		while(true) {
		try {
			System.out.println(a/b);
			break;
		}catch(ArithmeticException e) {
			System.out.println("Re-Enter the valid B Number: ");
			b=sc.nextInt();
		}
	}
		System.out.println("Main Ends...");
		sc.close();
	}
}
