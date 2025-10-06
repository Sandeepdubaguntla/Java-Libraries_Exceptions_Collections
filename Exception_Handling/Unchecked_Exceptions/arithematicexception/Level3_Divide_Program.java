package arithematicexception;

import java.util.Scanner;
//Level 3 Program is a with dangerous statements and Multiple try catch block to handle the exception.


public class Level3_Divide_Program {
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
			System.out.println("Enter valid B Number: ");
			b=sc.nextInt();
			try {
				System.out.println(a/b);
			}catch(ArithmeticException e1) {
				System.out.println("Le Dabba Fellow Enter valid B Number : ");
				b=sc.nextInt();
				try {
					System.out.println(a/b);
				}catch(ArithmeticException e3) {
					System.out.println("Please Enter valid B Number ðŸ™? : ");
					b=sc.nextInt();
					System.out.println(a/b);
				}
			}
		}
		System.out.println("Main Ends...");
		sc.close();
	}
}
