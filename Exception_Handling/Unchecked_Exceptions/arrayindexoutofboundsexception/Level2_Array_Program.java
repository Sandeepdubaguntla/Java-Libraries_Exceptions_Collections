package arrayindexoutofboundsexception;

import java.util.Scanner;

//Level 2 Program is a with dangerous statements and one try catch block to handle the exception.

public class Level2_Array_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		int arr[] = {1,7,0,2,6};
		System.out.println("Enter the Index of the Element :");
		int index = sc.nextInt();
		try {
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Re-Enter the valid Index :");
			index=sc.nextInt();
			System.out.println(arr[index]);
		}
		System.out.println("Main Ends...");
		sc.close();
	}
}
