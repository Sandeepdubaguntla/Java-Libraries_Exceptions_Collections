package arrayindexoutofboundsexception;

import java.util.Scanner;

//Level 5 Program is  with dangerous statements and one try catch block to handle the exception with while loop to give Limited chances for user.

public class Level5_Array_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts...");
		int arr[] = {1,7,0,2,6};
		System.out.println("Enter the Index of the Element :");
		int index = sc.nextInt();
		int chance=0;
		while(true) {
			try {
				System.out.println(arr[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				if(chance == 3) {
					System.out.println("Sorry, you have reached you Maximum limit:");
					break;
				}
				System.out.println("You have only "+(3-chance)+" chances...");
				System.out.println("Re-Enter the valid Index :");
				index=sc.nextInt();
				chance++;
				
			}
		}
		System.out.println("Main Ends...");
		sc.close();
	}
}
