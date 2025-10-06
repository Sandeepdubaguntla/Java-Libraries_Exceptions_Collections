package stringindexoutofboundsexception;

import java.util.Scanner;

//Level 4 Program is  with dangerous statements and one try catch block to handle the exception with while loop to give infinite chances for user.


public class Level5_String_Problem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String("Java");
		
		System.out.println("Enter the Index to get the Character :");
		int index=sc.nextInt();
		int chance=0;
		while(true) {
			try {
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e) {
				if(chance == 3) {
					System.out.println("Sorry, you have reached you Maximum limit:");
					break;
				}
				System.out.println("You have only "+(3-chance)+" chances...");
				System.out.println("Re-Enter the valid index to get char :");
				index=sc.nextInt();
				chance++;
			}
		}
		sc.close();
	}
}
