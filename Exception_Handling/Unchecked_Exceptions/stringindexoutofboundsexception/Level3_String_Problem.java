package stringindexoutofboundsexception;

import java.util.Scanner;

//Level 3 Program is a with dangerous statements and multiple try catch block to handle the exception.

public class Level3_String_Problem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String("Java");
		
		System.out.println("Enter the Index to get the Character :");
		int index=sc.nextInt();
		
		try {
			System.out.println(s.charAt(index));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Re-Enter the valid index to get char :");
			index=sc.nextInt();
			try {
				System.out.println(s.charAt(index));
			}
			catch(StringIndexOutOfBoundsException e1){
				System.out.println("Rey useless fellow enter the valid index of String : ");
				index=sc.nextInt();
				try {
					System.out.println(s.charAt(index));
				}
				catch(StringIndexOutOfBoundsException e2) {
					System.out.println("Please Enter the valid index of String to get char :");
					index=sc.nextInt();
					System.out.println(s.charAt(index));
				}
				
			}
		}
		sc.close();
	}
}
