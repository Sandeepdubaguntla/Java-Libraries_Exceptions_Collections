package arrayindexoutofboundsexception;

import java.util.Scanner;

//Level 4 Program is  with dangerous statements and one try catch block to handle the exception with while loop to give infinite chances for user.

public class Level4_Array_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		int arr[] = {1,7,0,2,6};
		System.out.println("Enter the Index of the Element :");
		int index = sc.nextInt();
		while(true) {
			try {
				System.out.println(arr[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Re-Enter the valid Index :");
				index=sc.nextInt();
				
			}
		}
		System.out.println("Main Ends...");
		sc.close();
	}
}
