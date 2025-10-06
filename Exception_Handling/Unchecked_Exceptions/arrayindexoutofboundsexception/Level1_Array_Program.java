package arrayindexoutofboundsexception;

import java.util.Scanner;

// Level 1 Program is a general clean program without dangerous statements or without statements with exception.

public class Level1_Array_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		int arr[] = {1,7,3,9,0,1};
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println("Main Ends...");
		sc.close();
	}
}
