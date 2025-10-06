package stringindexoutofboundsexception;

import java.util.Scanner;

//Level 4 Program is  with dangerous statements and one try catch block to handle the exception with while loop to give infinite chances for user.


public class Level4_String_Problem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String("Java");
		
		System.out.println("Enter the Index to get the Character :");
		int index=sc.nextInt();
		while(true) {
			try {
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Re-Enter the valid index to get char :");
				index=sc.nextInt();
			}
		}
		sc.close();
	}
}
