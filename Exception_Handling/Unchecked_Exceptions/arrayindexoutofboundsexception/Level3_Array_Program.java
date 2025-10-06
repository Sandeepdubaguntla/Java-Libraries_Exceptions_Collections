package arrayindexoutofboundsexception;

import java.util.Scanner;

//Level 3 Program is a with dangerous statements and multiple try catch block to handle the exception.


public class Level3_Array_Program {
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
			try {
				System.out.println(arr[index]);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("Rey dabba fellow Enter valid Index Number :");
				index=sc.nextInt();
				try {
					System.out.println(arr[index]);
				}
				catch(ArrayIndexOutOfBoundsException e2){
					System.out.println("Please enter the valid Index Number ðŸ™?ðŸ™? :");
					index=sc.nextInt();
					System.out.println(arr[index]);
				}
			}
		}
		System.out.println("Main Ends...");
		sc.close();
	}
}
