package Has_a_Relationship;

import java.util.Scanner;

public class Main_User {
	public static void main(String[] args) {
		User u = new User("Tarun","Male",8919465838l);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yes/no if you want to raise a ticket");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes")) {
			u.Userdetails();
			u.TicketD();
			
		}
		else {
			u.Userdetails();
		}
	}
	
}
