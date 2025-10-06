package arithematicexception;

import java.util.Scanner;

//Level 2 Program is a with dangerous statements and one try catch block to handle the exception.


public class Level2_Divide_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Can not divide a Number By Zero..");
		}
		System.out.println("Main Ends...");
		sc.close();
	}
}
